package it.polito.dp2.FDS.sol4.client;

import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.xml.XMLConstants;
import javax.xml.bind.*;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import it.polito.dp2.FDS.FlightMonitorException;
import it.polito.dp2.FDS.sol4.client.xsdBoarding.BoardingType;

/* Parser will read informations out of a XML file */

public class MyParser {
	
	// Variables
	//******************************
	
	private static final String CONTEXT_PATH = "it.polito.dp2.FDS.sol4.client.xsdBoarding";
	private BoardingType boarding = null;
	
	// Instanciate the document we need to parse
	//******************************
	
	public MyParser(String pathXml) throws FlightMonitorException, SAXException {
		try {
			
			File file = new File(pathXml);
			if ( !file.canRead() ) {
				throw new JAXBException("Can't read the xml file.");
			}
			String pathXmlSchema =  "./xsd/fdsBoarding.xsd";
			
			// Create instances
			JAXBContext jc = JAXBContext.newInstance(CONTEXT_PATH);
			Unmarshaller u = jc.createUnmarshaller();
			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			
			Schema schema = sf.newSchema(new File(pathXmlSchema));
			u.setSchema(schema);
			u.setEventHandler( new ValidationEventHandler() {
				public boolean handleEvent(ValidationEvent ve) {
					// ignore warnings
					if (ve.getSeverity() == ValidationEvent.WARNING) {
						@SuppressWarnings("unused")
						ValidationEventLocator vel = ve.getLocator();
					} 
					else {
						// block if fatal error or error
						@SuppressWarnings("unused")
						ValidationEventLocator vel = ve.getLocator();
						return false;
					}
					return true;
				}
			});
			
			// No warning
			@SuppressWarnings("unchecked")
			
			// Unmarshall
			JAXBElement<BoardingType> root = (JAXBElement<BoardingType>) u.unmarshal(file);
			boarding = root.getValue();
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public String parseFlightID() {
		return boarding.getFlight();
	}

	public XMLGregorianCalendar parseDate() {
		return boarding.getDate();
	}

	public String parseURL() {
		return boarding.getEndpoint();
	}

	public boolean startBoarding() {
		if ( boarding.getStartBoarding() == null ) {
			return false;
		}
		return true;
	}

	public List<String> getPassengers() {
		CopyOnWriteArrayList<String> passengers = new CopyOnWriteArrayList<String>();
		for ( String s : boarding.getPassenger() ) {
			passengers.add(s);
		}
		return passengers;
	}

	
}




