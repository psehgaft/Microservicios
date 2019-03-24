package it.polito.dp2.FDS.sol4.server;


import it.polito.dp2.FDS.Aircraft;
import it.polito.dp2.FDS.FlightInstanceReader;
import it.polito.dp2.FDS.FlightMonitor;
import it.polito.dp2.FDS.FlightMonitorException;
import it.polito.dp2.FDS.FlightReader;

/* It's my Implementation of Flight Monitor. It fills the informations starting from a
 * FlightMonitor type.
 */

public class MyFlightMonitorFactory {
	
	private MyFlightMonitor monitor = null;
	private ConvertFactory cf = null;
	
	public MyFlightMonitorFactory() {
		this.monitor = new MyFlightMonitor();
		cf = new ConvertFactory();
	}

	public MyFlightMonitor newInstance(FlightMonitor m) throws FlightMonitorException {
		
		// Add aircrafts
		for ( Aircraft a : m.getAircrafts()) {
			monitor.getAircrafts().add(a);
		}
		
		try {
			// Add flights
			for ( FlightReader fr : m.getFlights(null, null, null) ) {
				monitor.getFlights(null, null, null).add(cf.flightReaderTOflightReaderType(fr));
			}
			
			// Add Flight Instances
			for ( FlightInstanceReader fir : m.getFlightInstances(null, null, null)) {
				monitor.getFlightInstances(null, null, null).add(cf.firTOfirType(fir));
			}
			
		} catch (Exception e) {
			throw new FlightMonitorException(e.getMessage());
		} 
		return this.monitor;
	}

}
