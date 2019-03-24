package it.polito.dp2.FDS.sol4.server;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

import it.polito.dp2.FDS.MalformedArgumentException;
import it.polito.dp2.FDS.sol4.service.Control.FDSControl;
import it.polito.dp2.FDS.sol4.service.Control.InstanceNotBookedErrorType;
import it.polito.dp2.FDS.sol4.service.Control.InstanceNotBookedFault;
import it.polito.dp2.FDS.sol4.service.Control.InstanceNotFoundError;
import it.polito.dp2.FDS.sol4.service.Control.InstanceNotFoundMessage;
import it.polito.dp2.FDS.sol4.service.Control.InstanceYetBoardedError;
import it.polito.dp2.FDS.sol4.service.Control.RegisterInstanceNotFoundErrorType;
import it.polito.dp2.FDS.sol4.service.Control.RegisterPassengerNotFoundErrorMessage;
import it.polito.dp2.FDS.sol4.service.Control.RegisterPassengerNotFoundType;
import it.polito.dp2.FDS.sol4.service.Control.RegisterPassengerRequestType;
import it.polito.dp2.FDS.sol4.service.Control.RegisterPassengerResponseType;
import it.polito.dp2.FDS.sol4.service.Control.RegiterInstanceNotFoundError;
import it.polito.dp2.FDS.sol4.service.Control.ServiceUnavabileErrorType;
import it.polito.dp2.FDS.sol4.service.Control.ServiceUnavaibleMessage;
import it.polito.dp2.FDS.sol4.service.xsdpack.FlightInstanceReaderType;
import it.polito.dp2.FDS.sol4.service.xsdpack.PassengerReaderType;
import it.polito.dp2.FDS.sol4.service.xsdpack.StatusType;

@WebService(name="fdscontrol",
endpointInterface="it.polito.dp2.FDS.sol4.service.Control.FDSControl",
wsdlLocation = "META-INF/FDSControl.wsdl",
portName="FDSControlSOAP",
serviceName="FDSControlService",
targetNamespace="http://www.example.org/FDSControl/"
)

/* It's the webservice that allows control over the Flight System. 
 * 
 * Permitted Operations:
 *     - boardingInstance(flightNumber, date) = search the flight with given number and date, 
 *       and sets its status to "BOARDING" if it was in "CHECKINGIN" status.
 *     - registerPassenger(passengerRequest) = search the correct flight and date, search the passenger in this flight,
 *     	 if found sets its boarding flag to true.
 *     - getPassengers(date, flightNumber) = return a list of boarded passengers for flight with given date and number. 
 */

public class FDSControlImpl implements FDSControl{
	
	private MyFlightMonitor monitor = null;
	public FDSControlImpl(MyFlightMonitor m) {
		this.monitor = m;
		new ConvertFactory();
	}

	@Override
	public boolean boardingInstance(String flightNumber, XMLGregorianCalendar date) 
			throws InstanceNotFoundMessage,
			InstanceYetBoardedError,
			ServiceUnavaibleMessage {
		
		if (monitor == null) {
			throw new ServiceUnavaibleMessage("Service is not available.", new ServiceUnavabileErrorType());
		}
		// find the flight instance with flightNumber and date provided
		try {
			FlightInstanceReaderType firt = monitor.getFlightInstance(flightNumber, date.toGregorianCalendar());
			if (firt == null) {
				throw new InstanceNotFoundMessage("Instance not found.", new InstanceNotFoundError());
			}
			// change to BOARDING
			if ( firt.getStatus().toString().equalsIgnoreCase(StatusType.CHECKINGIN.toString()) ) {
				firt.setStatus(StatusType.BOARDING);
				return true;
			}
		} catch (InstanceNotFoundMessage e) {
			throw new InstanceNotFoundMessage(e.getMessage(), new InstanceNotFoundError());
		} catch (MalformedArgumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			throw new ServiceUnavaibleMessage(e.getMessage(), new ServiceUnavabileErrorType());
		}
		return false;
	}

	@Override
	public RegisterPassengerResponseType registerPassenger(RegisterPassengerRequestType parameters)
			throws InstanceNotBookedFault,
			RegisterPassengerNotFoundErrorMessage,
			RegiterInstanceNotFoundError, ServiceUnavaibleMessage {
		RegisterPassengerResponseType ret = new RegisterPassengerResponseType();
		try {
			// retrieve the specific flight instance
			FlightInstanceReaderType firt;
			firt = monitor.getFlightInstance(parameters.getFlightNumber(), parameters.getDate().toGregorianCalendar());
			if ( firt == null ) {
				throw new RegiterInstanceNotFoundError("Instance not found.", 
						new RegisterInstanceNotFoundErrorType());
			}
			if ( firt.getStatus().toString().equalsIgnoreCase(StatusType.BOARDING.toString()) == false) {
				throw new InstanceNotBookedFault("Instance was not in BOARDING status.", 
						new InstanceNotBookedErrorType());
			}
			// register every passenger's status to boarded
			for ( PassengerReaderType prt : firt.getPassengers().getPassengerReader()) {
				if ( prt == null ) {
					throw new RegisterPassengerNotFoundErrorMessage("Passenger not found, is null.", 
							new RegisterPassengerNotFoundType());
				}
				if ( prt.getName().startsWith(parameters.getPassenger()))
					if ( prt.getSeatID() != null ) {
						prt.setBoarded(true);
					}
			}
			ret.setReturnValue(true);
			return ret;
		} catch (MalformedArgumentException e) {
			throw new ServiceUnavaibleMessage(e.getMessage(), new ServiceUnavabileErrorType());
		} catch ( RegiterInstanceNotFoundError e1) {
			throw new RegiterInstanceNotFoundError("Instance not found.", new RegisterInstanceNotFoundErrorType());
		} catch (RegisterPassengerNotFoundErrorMessage e2) {
			throw new RegisterPassengerNotFoundErrorMessage("Passenger not found, is null.", new RegisterPassengerNotFoundType()); 
		} catch (InstanceNotBookedFault e3) {
			throw new InstanceNotBookedFault("Instance was not i BOARDING status.", new InstanceNotBookedErrorType());
		} catch (Exception e4) {
			throw new ServiceUnavaibleMessage(e4.getMessage(), new ServiceUnavabileErrorType());
		}
	}

	@Override
	public List<PassengerReaderType> getPassengers(XMLGregorianCalendar date,
			String flightNumber) throws InstanceNotFoundMessage,
			ServiceUnavaibleMessage {
		
		if ( monitor == null) {
			throw new ServiceUnavaibleMessage("Service not available.", new ServiceUnavabileErrorType());
		}
		// retrieve flight Instance
		FlightInstanceReaderType firt;
		try {
			firt = monitor.getFlightInstance(flightNumber, date.toGregorianCalendar());
			if ( firt == null ) {
				throw new InstanceNotFoundMessage("Instance not found.", new InstanceNotFoundError());
			}
			List<PassengerReaderType> boardedPass = new CopyOnWriteArrayList<PassengerReaderType>();
			for ( PassengerReaderType prt : firt.getPassengers().getPassengerReader()) {
				// for every passenger, add the boarded one to the list
				if ( prt.isBoarded()) {
					boardedPass.add(prt);
				}
			}
			return boardedPass;
		} catch (InstanceNotFoundMessage e) {
			throw new InstanceNotFoundMessage("Instance not found.", new InstanceNotFoundError());
		} catch (MalformedArgumentException e1) {
			throw new ServiceUnavaibleMessage(e1.getMessage(), new ServiceUnavabileErrorType());
		} catch (Exception e2) {
			throw new ServiceUnavaibleMessage(e2.getMessage(), new ServiceUnavabileErrorType());
		}
	}

}
