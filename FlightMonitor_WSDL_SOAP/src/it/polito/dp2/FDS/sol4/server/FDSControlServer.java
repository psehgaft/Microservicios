package it.polito.dp2.FDS.sol4.server;

import java.util.concurrent.Executors;

import javax.xml.ws.Endpoint;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.http.HTTPBinding;

import it.polito.dp2.FDS.FlightMonitor;
import it.polito.dp2.FDS.FlightMonitorFactory;
import it.polito.dp2.FDS.FactoryConfigurationError;
import it.polito.dp2.FDS.FlightMonitorException;

/* This is the server. 
 * Initialize the server by getting a MyFlightMonitor from a FlightMonitor.
 * Then it publishes the xsd files.
 * Lastly, it publishes the two services FDSControlImpl e FDSInfoImpl. */

public class FDSControlServer {

	private static final int N_THREADS = 10;
	private static final String FDS_CONTROL_URL = "http://localhost:7070/fdscontrol?wsdl";
	private static final String FDS_INFO_URL = "http://localhost:7071/fdsinfo?wsdl";
	private static final String XSD_FILE = "build/META-INF/FDSInfo_schema.xsd";
	private static final String XSD_URL = "http://localhost:7070/FDSInfo_schema.xsd";
	private static final String XSD_URL1 = "http://localhost:7071/FDSInfo_schema.xsd";

	public static void main(String[] args) {
		
		// Initialize data
		FlightMonitorFactory f = FlightMonitorFactory.newInstance();
		try {
			FlightMonitor m = f.newFlightMonitor();
			MyFlightMonitorFactory factory = new MyFlightMonitorFactory();
			MyFlightMonitor monitor = factory.newInstance(m);
			
			
			// Publish XSD separate file
			Endpoint ep = Endpoint.create(HTTPBinding.HTTP_BINDING, 
									new XMLFileProvider(XSD_FILE));
			ep.publish(XSD_URL);
			ep = Endpoint.create(HTTPBinding.HTTP_BINDING, 
					new XMLFileProvider(XSD_FILE));
			ep.publish(XSD_URL1);
			
			
			// FDS control service
			FDSControlImpl controlService = new FDSControlImpl(monitor);
			Endpoint controlEP = Endpoint.create(controlService);
			controlEP.setExecutor(Executors.newFixedThreadPool(N_THREADS));
			controlEP.publish(FDS_CONTROL_URL);
			
			// FDS control service
			FDSInfoImpl infoService = new FDSInfoImpl(monitor);
			Endpoint infoEP = Endpoint.create(infoService);
			infoEP.setExecutor(Executors.newFixedThreadPool(N_THREADS));
			infoEP.publish(FDS_INFO_URL);
			
		} 
		catch(WebServiceException e){
		 	System.out.println("WebserviceException: " + e.getMessage());
			System.exit(2);
		} 
		catch(FlightMonitorException fme){
			System.out.println("Monitor error: " + fme.getMessage());
			System.exit(2);
		} 
		catch(FactoryConfigurationError fce){
			System.out.println("Factory error: " + fce.getMessage());
			System.exit(2);
		} 
		catch (Exception e) {
			System.out.println("General error: " + e.getMessage());
			System.exit(2);
		}
		
		
	}

}
