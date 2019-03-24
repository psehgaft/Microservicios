
package org.example.fdsinfo_schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.fdsinfo_schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FlightMonitor_QNAME = new QName("http://www.example.org/FDSInfo_schema/", "FlightMonitor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.fdsinfo_schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlightMonitorType }
     * 
     */
    public FlightMonitorType createFlightMonitorType() {
        return new FlightMonitorType();
    }

    /**
     * Create an instance of {@link PassengersType }
     * 
     */
    public PassengersType createPassengersType() {
        return new PassengersType();
    }

    /**
     * Create an instance of {@link AircraftsType }
     * 
     */
    public AircraftsType createAircraftsType() {
        return new AircraftsType();
    }

    /**
     * Create an instance of {@link TimeType }
     * 
     */
    public TimeType createTimeType() {
        return new TimeType();
    }

    /**
     * Create an instance of {@link FlightInstancesType }
     * 
     */
    public FlightInstancesType createFlightInstancesType() {
        return new FlightInstancesType();
    }

    /**
     * Create an instance of {@link PassengerReaderType }
     * 
     */
    public PassengerReaderType createPassengerReaderType() {
        return new PassengerReaderType();
    }

    /**
     * Create an instance of {@link AircraftType }
     * 
     */
    public AircraftType createAircraftType() {
        return new AircraftType();
    }

    /**
     * Create an instance of {@link FlightReaderType }
     * 
     */
    public FlightReaderType createFlightReaderType() {
        return new FlightReaderType();
    }

    /**
     * Create an instance of {@link SeatsType }
     * 
     */
    public SeatsType createSeatsType() {
        return new SeatsType();
    }

    /**
     * Create an instance of {@link FlightsType }
     * 
     */
    public FlightsType createFlightsType() {
        return new FlightsType();
    }

    /**
     * Create an instance of {@link FlightInstanceReaderType }
     * 
     */
    public FlightInstanceReaderType createFlightInstanceReaderType() {
        return new FlightInstanceReaderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightMonitorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo_schema/", name = "FlightMonitor")
    public JAXBElement<FlightMonitorType> createFlightMonitor(FlightMonitorType value) {
        return new JAXBElement<FlightMonitorType>(_FlightMonitor_QNAME, FlightMonitorType.class, null, value);
    }

}
