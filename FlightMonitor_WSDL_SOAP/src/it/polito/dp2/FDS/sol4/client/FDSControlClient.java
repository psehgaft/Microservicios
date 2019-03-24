package it.polito.dp2.FDS.sol4.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceException;

import it.polito.dp2.FDS.sol4.service.Control.FDSControl;
import it.polito.dp2.FDS.sol4.service.Control.FDSControlService;
import it.polito.dp2.FDS.sol4.service.Control.InstanceNotBookedFault;
import it.polito.dp2.FDS.sol4.service.Control.InstanceNotFoundMessage;
import it.polito.dp2.FDS.sol4.service.Control.InstanceYetBoardedError;
import it.polito.dp2.FDS.sol4.service.Control.RegisterPassengerNotFoundErrorMessage;
import it.polito.dp2.FDS.sol4.service.Control.RegisterPassengerRequestType;
import it.polito.dp2.FDS.sol4.service.Control.RegiterInstanceNotFoundError;
import it.polito.dp2.FDS.sol4.service.Control.ServiceUnavaibleMessage;
import it.polito.dp2.FDS.sol4.service.xsdpack.PassengerReaderType;

/* reads a xml with boarding operations using a Parser, then start boarding phase (if requested) 
 * sending to the server a list of passengers to be boarded.
 * Write list of added passengers to outputXML using a Serializer. */

public class FDSControlClient {
	
	private static final String regex = "([a-zA-Z]{2})([0-9]{0,4})";
	private static String inputXML = "./samples/fdsBoarding4.xml";
	private static String outputXML = "risultatoIVOnuovo.xml";
	
	public static void main(String[] args) {
		// test passed parameters
		
		if ( args.length != 2) {
			System.out.println("Wrong number of arguments.");
			System.exit(2);
		}
		
		// Get XML paths
		inputXML = args[0];
		outputXML = args[1];
		
		if (inputXML.isEmpty() || inputXML == null) {
			System.out.println("ERROR: Input XML is null or empty.");
			System.exit(2);
		}
		if (outputXML.isEmpty() || outputXML == null) {
			System.out.println("ERROR: output XML is null or empty.");
			System.exit(2);
		}
		
		System.out.println("input is "+inputXML);
		System.out.println("output is "+outputXML);
		
		
		MyParser parser = null;
		MySerializer serializer = null;
		
		try {
			parser = new MyParser(inputXML);
			serializer = new MySerializer(outputXML);
			FDSControl proxy;
			
			// retrieve flightID
			String flightID = parser.parseFlightID();
			if ( flightID == null || flightID.isEmpty() || !flightID.matches(regex)) {
				System.out.println("ERROR: flightID("+flightID+") is null or doesn't match the regexp.");
				System.exit(1);
			}
			
			// retrieve date
			XMLGregorianCalendar date = parser.parseDate();
			if ( date == null ) {
				System.out.println("ERROR: flightID("+ flightID +") is null or doesn't match the regexp.");
				System.exit(1);
			}
			
			// retrieve URL
			if ( parser.parseURL().isEmpty() || parser.parseURL() == null){
				System.out.println("ERROR: url string error.");
				System.exit(1);
			
			}
			URL url = new URL(parser.parseURL());
			proxy = new FDSControlService(url).getFDSControlSOAP();
			
			// if the boarding tag is present, start the boarding phase
			if ( parser.startBoarding() ) {
				System.out.println("AAAAAAAAAAAAAA-entrato in startBoarding.");
				if ( proxy.boardingInstance(flightID, date) == false) {
					System.out.println("Instance is not in CHECK-IN status.");
					System.exit(1);
				}
			}
				
			//start Boarding
			System.out.println("Start Boarding passengers of flight "+flightID);
			
			for ( String s : parser.getPassengers() ) {
				RegisterPassengerRequestType req = new RegisterPassengerRequestType();
				req.setDate(date);
				req.setFlightNumber(flightID);
				req.setPassenger(s);
				if ( proxy.registerPassenger(req).isReturnValue() == false ) {
					System.out.println("ERROR: passenger "+s+" was not boarded correctly.");
					System.exit(1);
				}
			}
			
			// Serialize response
			serializer.setFlightID(flightID);
			serializer.setDate(date);
			for ( PassengerReaderType prt : proxy.getPassengers(date, flightID) ) {
				serializer.addPassenger(prt);
			}
		
			serializer.createMarshall();
			
			System.out.println("Boarding operation for flight "+flightID+" was succesfully completed.");
			System.exit(0);
			
			
		} catch ( MalformedURLException e ) {
				System.out.println("ERROR: wrong url.");
				System.exit(1);
		} catch ( JAXBException e ){
				System.out.println("ERROR: JAXB error, "+e.getMessage());
				System.exit(1);
		} catch ( InstanceNotFoundMessage e ) {
				System.out.println("ERROR: Instance not found, "+e.getMessage());
				System.exit(1);
		} catch ( InstanceYetBoardedError e ) {
				System.out.println("ERROR: Instance yet boarded, "+e.getMessage());
				System.exit(1);
		} catch ( ServiceUnavaibleMessage e ) {
				System.out.println("ERROR: Service Unavaible, "+e.getMessage());
				System.exit(2);
		} catch ( RegisterPassengerNotFoundErrorMessage e ) {
				System.out.println("ERROR: Passenger not found, "+e.getMessage());
				System.exit(1);
		} catch ( RegiterInstanceNotFoundError e ) {
				System.out.println("ERROR: Instance not found, "+e.getMessage());
				System.exit(1);
		} catch ( InstanceNotBookedFault e ) {
				System.out.println("ERROR: Instance not in booking state, "+e.getMessage());
				System.exit(1);
		} catch ( WebServiceException e ){
				System.out.println("ERROR: WebService error, "+e.getMessage());
				System.exit(2);
		} catch(Exception e ){
				System.out.println("ERROR: Service error, "+e.getMessage());
				System.exit(2);
	}
}}
