package it.polito.dp2.FDS.sol4.server;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.datatype.XMLGregorianCalendar;

import it.polito.dp2.FDS.Aircraft;
import it.polito.dp2.FDS.FlightInstanceStatus;
import it.polito.dp2.FDS.MalformedArgumentException;
import it.polito.dp2.FDS.Time;
import it.polito.dp2.FDS.sol4.service.xsdpack.FlightInstanceReaderType;
import it.polito.dp2.FDS.sol4.service.xsdpack.FlightReaderType;
import it.polito.dp2.FDS.sol4.service.xsdpack.TimeType;

/* Provides an Interface for reading all the Flight System Information */

public class MyFlightMonitor {
	
	private Set<Aircraft> Aircrafts = new HashSet<Aircraft>();
	private List<FlightReaderType> Flight = new ArrayList<FlightReaderType>();
	private List<FlightInstanceReaderType> FlightInstances = new ArrayList<FlightInstanceReaderType>();
	
	public Set<Aircraft> getAircrafts() {
		return this.Aircrafts;
	}

	public FlightReaderType getFlight(String flightCode)
			throws MalformedArgumentException {
		for (FlightReaderType frt : this.Flight) 
			if ( frt.getFlightNumber().equalsIgnoreCase(flightCode)) {
				return frt;
			}
		return null;
	}

	public FlightInstanceReaderType getFlightInstance(String arg0,
			GregorianCalendar arg1) throws MalformedArgumentException {
		if ( arg0 == null || arg1 == null ) {
			throw new MalformedArgumentException("getFlightInstance: arg0 or arg1 are null.");
		}
		// search the flight with code arg0 and departure time arg1
		for (FlightInstanceReaderType fir : this.FlightInstances ) {
			if ( fir.getFlightID().equalsIgnoreCase(arg0) ) {
				if ( sameDate(fir.getDate(), arg1) == true) {
					return fir;
				}
			}
		}
		return null;
	}

	
	private boolean sameDate(XMLGregorianCalendar date, GregorianCalendar arg1) {
		// it's same date if hour, day, month and year are the same
		//if ( date.getHour() != arg1.get(GregorianCalendar.HOUR))
			//return false;
		if ( date.getDay() != arg1.get(GregorianCalendar.DAY_OF_MONTH))
			return false;
		if ( date.getMonth() != (arg1.get(GregorianCalendar.MONTH)+1)) 
			return false;
		if ( date.getYear() != arg1.get(GregorianCalendar.YEAR))
			return false;
		return true;
	}

	/* Returns the FlightInstance with
		- flightNumber arg0
		- startDate arg1
		- status arg2
	 */
	
	public List<FlightInstanceReaderType> getFlightInstances(String flightNumber,
			GregorianCalendar startDate, FlightInstanceStatus status)
			throws MalformedArgumentException {
		
		List<FlightInstanceReaderType> allFI = this.FlightInstances;
		
		// Remove the flightInstances with flight code != flightNumber
		if (flightNumber != null) 
			for (int i=0; i < allFI.size(); i++) 
				if (allFI.get(i).getFlightID() != flightNumber) 
					allFI.remove(i);	// remove this flightInstance
		
		// Remove the flightInstances with date < startDate
		if (startDate != null) 
			for (int i=0; i < allFI.size(); i++) 
				if ( allFI.get(i).getDate().toGregorianCalendar().compareTo(startDate) < 0) 
					allFI.remove(i);
		
		// Remove the flightInstances with status != status
		if (status != null) 
			for (int i=0; i < allFI.size(); i++) 
				if ( allFI.get(i).getStatus().toString().equalsIgnoreCase(status.toString()) == false) 
					allFI.remove(i);
		
		return allFI;
	}

	public List<FlightReaderType> getFlights(String dep, String dest, Time startTime)
			throws MalformedArgumentException {
		
		List<FlightReaderType> allF = this.Flight;
		
		// Remove the flights with departureAirport != dep
		if (dep != null) {
			for (int i=0; i < allF.size(); i++) {
				if (allF.get(i).getDeparture() != dep) {
					allF.remove(i);
				}
			}
		}
		
		// Remove the flights with destinationAirport != dest
		if (dest != null) {
			for (int i=0; i < allF.size(); i++) {
				if (allF.get(i).getDestination() != dest) {
					allF.remove(i);
				}
			}
		}
		
		// If startTime is null, set it to 00:00am
		if (startTime == null) 
			startTime = new Time(0, 0);
		
		// Remove the flights with time < startTime
		for (int i=0; i < allF.size(); i++) 
			if ( compareTime(allF.get(i).getTime(), startTime) < 0) {
				allF.remove(i);
			}
		
		return this.Flight;
	}

	private int compareTime(TimeType time, Time startTime) {
		if ( time.getHour() == startTime.getHour() )
			return time.getMinute() - startTime.getMinute();
		return time.getHour() - startTime.getHour();
	}

}
