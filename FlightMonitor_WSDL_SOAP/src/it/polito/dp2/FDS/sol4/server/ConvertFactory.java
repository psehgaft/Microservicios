package it.polito.dp2.FDS.sol4.server;

import java.math.BigInteger;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import it.polito.dp2.FDS.Aircraft;
import it.polito.dp2.FDS.FlightInstanceReader;
import it.polito.dp2.FDS.FlightInstanceStatus;
import it.polito.dp2.FDS.FlightReader;
import it.polito.dp2.FDS.PassengerReader;
import it.polito.dp2.FDS.Time;
import it.polito.dp2.FDS.sol4.service.xsdpack.AircraftType;
import it.polito.dp2.FDS.sol4.service.xsdpack.FlightInstanceReaderType;
import it.polito.dp2.FDS.sol4.service.xsdpack.FlightReaderType;
import it.polito.dp2.FDS.sol4.service.xsdpack.PassengerReaderType;
import it.polito.dp2.FDS.sol4.service.xsdpack.PassengersType;
import it.polito.dp2.FDS.sol4.service.xsdpack.SeatsType;
import it.polito.dp2.FDS.sol4.service.xsdpack.StatusType;
import it.polito.dp2.FDS.sol4.service.xsdpack.TimeType;

/* It'a a conversion class for changing between types */

public class ConvertFactory {
	
	public Time timeTypeTOtime(TimeType tt) {
		Time time = new Time(tt.getHour(), tt.getMinute());
		return time;
	}
	
	public FlightReaderType flightReaderTOflightReaderType(FlightReader fr) {
		FlightReaderType frt = new FlightReaderType();
		frt.setDeparture(fr.getDepartureAirport());		//dep
		frt.setDestination(fr.getDestinationAirport());	//dest
		frt.setFlightNumber(fr.getNumber());			//number
		TimeType timeType = new TimeType();				
		timeType.setHour(fr.getDepartureTime().getHour());
		timeType.setMinute(fr.getDepartureTime().getMinute());
		frt.setTime(timeType);							//time
		return frt;
	}
	
	public AircraftType aircraftTOaircraftType( Aircraft a) {
		AircraftType at = new AircraftType();
		at.setModel(a.model);
		SeatsType st = new SeatsType();
		for (String s : a.seats) {
			st.getSeat().add(s);
		}
		at.setSeats(st);
		return at;
	}
	
	public FlightInstanceStatus statusTOfiStatus(StatusType status) {
		return FlightInstanceStatus.valueOf(status.value());
	}

	public GregorianCalendar xmlGregCalTOgregCal(XMLGregorianCalendar d) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(d.getYear(), d.getMonth(), d.getDay(), d.getHour(), d.getMinute(), d.getSecond());
		return gc;
	}

	public FlightInstanceReaderType firTOfirType(FlightInstanceReader fir) throws DatatypeConfigurationException {
		FlightInstanceReaderType firt = new FlightInstanceReaderType();
		firt.setAircraftID(fir.getAircraft().model);
		firt.setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(fir.getDate()));
		firt.setDelay(BigInteger.valueOf(fir.getDelay()));
		firt.setDepartureGate(fir.getDepartureGate());
		firt.setFlightID(fir.getFlight().getNumber());
		firt.setStatus(StatusType.valueOf(fir.getStatus().toString()));
		PassengersType pt = new PassengersType();
		for (PassengerReader pr : fir.getPassengerReaders(null)) {
			PassengerReaderType prt = prTOprType(pr);
			pt.getPassengerReader().add(prt);
		}
		firt.setPassengers(pt);
		return firt;
	}

	public PassengerReaderType prTOprType(PassengerReader pr) {
		PassengerReaderType prt = new PassengerReaderType();
		prt.setBoarded(pr.boarded());
		prt.setName(pr.getName());
		prt.setSeatID(pr.getSeat());
		return prt;
	}

}
