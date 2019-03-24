package it.polito.dp2.FDS.sol4.server;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

import it.polito.dp2.FDS.Aircraft;
import it.polito.dp2.FDS.FlightInstanceStatus;
import it.polito.dp2.FDS.MalformedArgumentException;
import it.polito.dp2.FDS.sol4.service.Info.FDSInfo;
import it.polito.dp2.FDS.sol4.service.Info.GetAircraftsFault;
import it.polito.dp2.FDS.sol4.service.Info.GetAllFault;
import it.polito.dp2.FDS.sol4.service.Info.GetFlightFault;
import it.polito.dp2.FDS.sol4.service.Info.GetFlightFaultType;
import it.polito.dp2.FDS.sol4.service.Info.GetFlightsFault;
import it.polito.dp2.FDS.sol4.service.Info.GetFlightsFaultType;
import it.polito.dp2.FDS.sol4.service.Info.GetFlightsParamErr;
import it.polito.dp2.FDS.sol4.service.Info.GetFlightsParamErrType;
import it.polito.dp2.FDS.sol4.service.Info.GetInstanceFault;
import it.polito.dp2.FDS.sol4.service.Info.GetInstanceFaultType;
import it.polito.dp2.FDS.sol4.service.Info.GetInstancesFault;
import it.polito.dp2.FDS.sol4.service.Info.GetInstancesFaultType;
import it.polito.dp2.FDS.sol4.service.Info.GetPassengerFault;
import it.polito.dp2.FDS.sol4.service.Info.GetPassengerFaultType;
import it.polito.dp2.FDS.sol4.service.Info.GetPassengersFault;
import it.polito.dp2.FDS.sol4.service.Info.GetPassengersFaultType;
import it.polito.dp2.FDS.sol4.service.xsdpack.AircraftType;
import it.polito.dp2.FDS.sol4.service.xsdpack.AircraftsType;
import it.polito.dp2.FDS.sol4.service.xsdpack.FlightInstanceReaderType;
import it.polito.dp2.FDS.sol4.service.xsdpack.FlightInstancesType;
import it.polito.dp2.FDS.sol4.service.xsdpack.FlightMonitorType;
import it.polito.dp2.FDS.sol4.service.xsdpack.FlightReaderType;
import it.polito.dp2.FDS.sol4.service.xsdpack.FlightsType;
import it.polito.dp2.FDS.sol4.service.xsdpack.PassengerReaderType;
import it.polito.dp2.FDS.sol4.service.xsdpack.StatusType;
import it.polito.dp2.FDS.sol4.service.xsdpack.TimeType;

@WebService(name="fdsinfo",
endpointInterface="it.polito.dp2.FDS.sol4.service.Info.FDSInfo",
wsdlLocation = "META-INF/FDSInfo.wsdl",
portName="FDSInfoSOAP",
serviceName="FDSInfoService",
targetNamespace="http://www.example.org/FDSInfo/"
)

/* It's the service that allows collecting Information over a Flight System 
 * 
 * Permitted Operations:
 * 		- getAircrafts(model) = retrieve Aircraft with given model
 * 		- getFlights(departure, destination, time) = retrieve a list of flights with given dep, dest, and time.
 * 		- getInstances(flightNumber, date, status) = retrieve a flight instance with given flightNumber, date, status
 * 		- getPassengers(date, flightNUmber) = get passengers of a flight instance with given date and flightNumber
 * 		- getPassenger(date, flightNumber, name) = returns the passenger whoich name starts with 'name' from 
 * 			flight instance with given date and flightNumber.
 * 		- getFlight(flightNumber) = retrieve the flight with flightNumber.
 * 		- getInstance(flightNumber, date) = retrieve a flight Instance with given flightNumber and date.
 * 		- getAll() = retrieve all the informations
 * */ 

public class FDSInfoImpl implements FDSInfo {
	
	private MyFlightMonitor monitor = null;
	private ConvertFactory cf = null;

	/********************/
	public FDSInfoImpl(MyFlightMonitor monitor) {
		this.monitor = monitor;
		this.cf  = new ConvertFactory();
	}

	/*********************/
	// gli passo model ma mica lo uso
	@Override
	public List<AircraftType> getAircrafts(String model)
			throws GetAircraftsFault {
		List<AircraftType> list = new CopyOnWriteArrayList<AircraftType>();
		for ( Aircraft a : monitor.getAircrafts()) {
			if (a.model.compareToIgnoreCase(model) == 0) { // not tested
				list.add(cf.aircraftTOaircraftType(a));
			}
		}
		return list;
	}

	/*********************/
	@Override
	public List<FlightReaderType> getFlights(String departure,
			String destination, TimeType time) throws GetFlightsFault,
			GetFlightsParamErr {
		
		List<FlightReaderType> returnList = null;
		try {
			// retrieve data
			List<FlightReaderType> list = monitor.getFlights(departure, destination, cf.timeTypeTOtime(time));
			//List<FlightReaderType> list = monitor.getFlights(null, null, null);
			returnList = new CopyOnWriteArrayList<FlightReaderType>();
			// convert every FlightReader
			for ( FlightReaderType frt : list ) {
				returnList.add(frt);
			}
			return returnList;
			
		} catch (MalformedArgumentException e) {
			throw new GetFlightsParamErr(e.getMessage(), new GetFlightsParamErrType());
		} catch (Exception e) {
			throw new GetFlightsFault(e.getMessage(), new GetFlightsFaultType());
		}
		
	}

	/*****************/
	@Override
	public List<FlightInstanceReaderType> getInstances(String flightNumber,
			XMLGregorianCalendar date, StatusType status)
			throws GetInstancesFault {
		
		if ( flightNumber == null || flightNumber.isEmpty() || date == null ) {
			System.out.println("flightNumber or date was null. (getInstances)");
			return null;
		}
		
		FlightInstanceStatus fistatus = cf.statusTOfiStatus(status);
		GregorianCalendar gcdate = cf.xmlGregCalTOgregCal(date);
		try {
			// retrieve data
			List<FlightInstanceReaderType> db = monitor.getFlightInstances(flightNumber, gcdate, fistatus);
			//List<FlightInstanceReaderType> db = monitor.getFlightInstances(null, null, null);
			List<FlightInstanceReaderType> list = new CopyOnWriteArrayList<FlightInstanceReaderType>();
			// populate the list
			for (FlightInstanceReaderType firt : db) {
				list.add(firt);
			}
			// return the list
			return list;
		} catch (Exception e) {
			throw new GetInstancesFault(e.getMessage(), new GetInstancesFaultType());
		} 
	}

	/*****************/
	@Override
	public List<PassengerReaderType> getPassengers(XMLGregorianCalendar date,
			String flightNumber) throws GetPassengersFault {
		try {
			List<PassengerReaderType> list = new CopyOnWriteArrayList<PassengerReaderType>();
			// retrieve corresponding FlightInstanceReader
			FlightInstanceReaderType firt = monitor.getFlightInstance(flightNumber, date.toGregorianCalendar());
			// populate the list
			if (firt == null) {
				System.out.println("Flight Instance not found.");
				return null;
			}
			if (firt.getPassengers() == null) {
				System.out.println("Flight Instance doesn't have passengers.");
				return null;
			}
			for ( PassengerReaderType prt : firt.getPassengers().getPassengerReader() ) {
				list.add(prt);
			}
			// return the list
			return list;
		} catch (Exception e) {
			throw new GetPassengersFault(e.getMessage(), new GetPassengersFaultType());
		}
	}

	/*******************/
	@Override
	public PassengerReaderType getPassenger(XMLGregorianCalendar date,
			String flightNumber, String name) throws GetPassengerFault {
			try {
				FlightInstanceReaderType firt = monitor.getFlightInstance(flightNumber, cf.xmlGregCalTOgregCal(date));
				for ( PassengerReaderType prt : firt.getPassengers().getPassengerReader() ) {
					// search for the right passenger
					if ( prt.getName().startsWith(name) ) {
						return prt;
					}
				}
				return null;
			} catch (MalformedArgumentException e) {
				throw new GetPassengerFault(e.getMessage(), new GetPassengerFaultType());
			}
	}

	/******************/
	@Override
	public FlightReaderType getFlight(String flightNumber)
			throws GetFlightFault {
		try {
			FlightReaderType frt = monitor.getFlight(flightNumber);
			if (frt != null) 
				return frt;
			else
				return null;
		} 
		catch ( MalformedArgumentException e ) {
			throw new GetFlightFault(e.getMessage(), new GetFlightFaultType());
		}
	}

	/*******************/
	@Override
	public FlightInstanceReaderType getInstance(String flightNumber,
			XMLGregorianCalendar date) throws GetInstanceFault {
		try {
			FlightInstanceReaderType firt = monitor.getFlightInstance(flightNumber, date.toGregorianCalendar());
			return firt;
		} catch (Exception e) {
			throw new GetInstanceFault(e.getMessage(), new GetInstanceFaultType());
		}
	}

	/********************/
	@Override
	public FlightMonitorType getAll() throws GetAllFault {
		FlightMonitorType fmt = new FlightMonitorType();
		// aircrafts
		AircraftsType at = new AircraftsType();
		for (Aircraft a : monitor.getAircrafts()) {
			at.getAircraft().add(cf.aircraftTOaircraftType(a));
		}
		fmt.setAircrafts(at);
		try {
			// flights
			FlightsType ft = new FlightsType();
			for ( FlightReaderType frt : monitor.getFlights(null, null, null)) {
				ft.getFlightReader().add(frt);
			}
			fmt.setFlights(ft);
			
			// flight instances
			FlightInstancesType fit = new FlightInstancesType();
			for ( FlightInstanceReaderType firt : monitor.getFlightInstances(null, null, null)) {
				fit.getFlightInstanceReader().add(firt);
			}
			fmt.setFlightInstances(fit);
		} catch (MalformedArgumentException e) {
			e.printStackTrace();
		}
		
		return fmt;
	}

}
