package it.polito.dp2.FDS.sol4.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import it.polito.dp2.FDS.sol4.client.xsdList.BoardListType;
import it.polito.dp2.FDS.sol4.client.xsdList.ObjectFactory;
import it.polito.dp2.FDS.sol4.client.xsdList.PassengerType;
import it.polito.dp2.FDS.sol4.service.xsdpack.PassengerReaderType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.XMLGregorianCalendar;

/* The Serializer prints in an output file all the informations
 * regarding a boarding operation. */


public class MySerializer {

	private static String CONTEXT_PATH = "it.polito.dp2.FDS.sol4.client.xsdList";
	private static String SCHEMA_PATH = "./xsd/boardList.xsd";

	private JAXBElement<BoardListType> JAXBroot;
	private BoardListType root;
	private JAXBContext jContext;
	private ObjectFactory oFactory = new ObjectFactory();
	private String file;
	
	public MySerializer(String outputXML) throws JAXBException {
		this.file = outputXML;
		try {
			jContext = JAXBContext.newInstance(CONTEXT_PATH);
			root = oFactory.createBoardListType();
			JAXBroot = oFactory.createBoardList(root);
			
		} catch (JAXBException e) {
			throw new JAXBException(e.getMessage());
		}
	}

	public void setFlightID(String flightID) {
		root.setFlight(flightID);
	}

	public void setDate(XMLGregorianCalendar date) {
		root.setDate(date);
	}

	public void addPassenger(PassengerReaderType prt) {
		PassengerType pt = oFactory.createPassengerType();
		pt.setSeat(prt.getSeatID());
		pt.setValue(prt.getName());
		root.getPassenger().add(pt);
	}

	public void createMarshall() throws JAXBException {
		Marshaller marsh;
		try {
			marsh = jContext.createMarshaller();
			marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marsh.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, SCHEMA_PATH);
			marsh.marshal(JAXBroot, new FileOutputStream(new File(file)));
		} catch (JAXBException e) {
			throw new JAXBException(e.getMessage());
		} catch (FileNotFoundException e) {
			throw new JAXBException(e.getMessage());
		}
	}

}
