
package org.example.fdsinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.fdsinfo package. 
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

    private final static QName _GetFlightsParamErr_QNAME = new QName("http://www.example.org/FDSInfo/", "GetFlightsParamErr");
    private final static QName _GetPassengersFault_QNAME = new QName("http://www.example.org/FDSInfo/", "getPassengersFault");
    private final static QName _GetAllFault_QNAME = new QName("http://www.example.org/FDSInfo/", "getAllFault");
    private final static QName _GetPassengersResponse_QNAME = new QName("http://www.example.org/FDSInfo/", "getPassengersResponse");
    private final static QName _GetFlightResponse_QNAME = new QName("http://www.example.org/FDSInfo/", "getFlightResponse");
    private final static QName _GetFlights_QNAME = new QName("http://www.example.org/FDSInfo/", "getFlights");
    private final static QName _GetFlightFault_QNAME = new QName("http://www.example.org/FDSInfo/", "getFlightFault");
    private final static QName _GetAircrafts_QNAME = new QName("http://www.example.org/FDSInfo/", "getAircrafts");
    private final static QName _GetInstanceFault_QNAME = new QName("http://www.example.org/FDSInfo/", "getInstanceFault");
    private final static QName _GetPassengerResponse_QNAME = new QName("http://www.example.org/FDSInfo/", "getPassengerResponse");
    private final static QName _GetInstancesFault_QNAME = new QName("http://www.example.org/FDSInfo/", "getInstancesFault");
    private final static QName _GetPassengerFault_QNAME = new QName("http://www.example.org/FDSInfo/", "getPassengerFault");
    private final static QName _GetPassengers_QNAME = new QName("http://www.example.org/FDSInfo/", "getPassengers");
    private final static QName _GetAircraftsResponse_QNAME = new QName("http://www.example.org/FDSInfo/", "getAircraftsResponse");
    private final static QName _GetPassenger_QNAME = new QName("http://www.example.org/FDSInfo/", "getPassenger");
    private final static QName _GetFlightsResponse_QNAME = new QName("http://www.example.org/FDSInfo/", "getFlightsResponse");
    private final static QName _GetInstancesResponse_QNAME = new QName("http://www.example.org/FDSInfo/", "getInstancesResponse");
    private final static QName _GetInstance_QNAME = new QName("http://www.example.org/FDSInfo/", "getInstance");
    private final static QName _GetInstances_QNAME = new QName("http://www.example.org/FDSInfo/", "getInstances");
    private final static QName _GetAll_QNAME = new QName("http://www.example.org/FDSInfo/", "getAll");
    private final static QName _GetAircraftsFault_QNAME = new QName("http://www.example.org/FDSInfo/", "getAircraftsFault");
    private final static QName _GetFlightsFault_QNAME = new QName("http://www.example.org/FDSInfo/", "getFlightsFault");
    private final static QName _GetAllResponse_QNAME = new QName("http://www.example.org/FDSInfo/", "getAllResponse");
    private final static QName _GetInstanceResponse_QNAME = new QName("http://www.example.org/FDSInfo/", "getInstanceResponse");
    private final static QName _GetFlight_QNAME = new QName("http://www.example.org/FDSInfo/", "getFlight");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.fdsinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFlightResponseType }
     * 
     */
    public GetFlightResponseType createGetFlightResponseType() {
        return new GetFlightResponseType();
    }

    /**
     * Create an instance of {@link GetFlightsRequestType }
     * 
     */
    public GetFlightsRequestType createGetFlightsRequestType() {
        return new GetFlightsRequestType();
    }

    /**
     * Create an instance of {@link GetFlightFaultType }
     * 
     */
    public GetFlightFaultType createGetFlightFaultType() {
        return new GetFlightFaultType();
    }

    /**
     * Create an instance of {@link GetAircraftsRequestType }
     * 
     */
    public GetAircraftsRequestType createGetAircraftsRequestType() {
        return new GetAircraftsRequestType();
    }

    /**
     * Create an instance of {@link GetInstanceFaultType }
     * 
     */
    public GetInstanceFaultType createGetInstanceFaultType() {
        return new GetInstanceFaultType();
    }

    /**
     * Create an instance of {@link GetPassengerResponseType }
     * 
     */
    public GetPassengerResponseType createGetPassengerResponseType() {
        return new GetPassengerResponseType();
    }

    /**
     * Create an instance of {@link GetInstancesFaultType }
     * 
     */
    public GetInstancesFaultType createGetInstancesFaultType() {
        return new GetInstancesFaultType();
    }

    /**
     * Create an instance of {@link GetFlightsParamErrType }
     * 
     */
    public GetFlightsParamErrType createGetFlightsParamErrType() {
        return new GetFlightsParamErrType();
    }

    /**
     * Create an instance of {@link GetPassengersFaultType }
     * 
     */
    public GetPassengersFaultType createGetPassengersFaultType() {
        return new GetPassengersFaultType();
    }

    /**
     * Create an instance of {@link GetAllFaultType }
     * 
     */
    public GetAllFaultType createGetAllFaultType() {
        return new GetAllFaultType();
    }

    /**
     * Create an instance of {@link GetPassengersResponseType }
     * 
     */
    public GetPassengersResponseType createGetPassengersResponseType() {
        return new GetPassengersResponseType();
    }

    /**
     * Create an instance of {@link GetInstancesRequestType }
     * 
     */
    public GetInstancesRequestType createGetInstancesRequestType() {
        return new GetInstancesRequestType();
    }

    /**
     * Create an instance of {@link GetAllRequestType }
     * 
     */
    public GetAllRequestType createGetAllRequestType() {
        return new GetAllRequestType();
    }

    /**
     * Create an instance of {@link GerAircraftsFaultType }
     * 
     */
    public GerAircraftsFaultType createGerAircraftsFaultType() {
        return new GerAircraftsFaultType();
    }

    /**
     * Create an instance of {@link GetFlightsFaultType }
     * 
     */
    public GetFlightsFaultType createGetFlightsFaultType() {
        return new GetFlightsFaultType();
    }

    /**
     * Create an instance of {@link GetAllResponseType }
     * 
     */
    public GetAllResponseType createGetAllResponseType() {
        return new GetAllResponseType();
    }

    /**
     * Create an instance of {@link GetInstanceResponseType }
     * 
     */
    public GetInstanceResponseType createGetInstanceResponseType() {
        return new GetInstanceResponseType();
    }

    /**
     * Create an instance of {@link GetFlightRequestType }
     * 
     */
    public GetFlightRequestType createGetFlightRequestType() {
        return new GetFlightRequestType();
    }

    /**
     * Create an instance of {@link GetPassengerFaultType }
     * 
     */
    public GetPassengerFaultType createGetPassengerFaultType() {
        return new GetPassengerFaultType();
    }

    /**
     * Create an instance of {@link GetPassengersType }
     * 
     */
    public GetPassengersType createGetPassengersType() {
        return new GetPassengersType();
    }

    /**
     * Create an instance of {@link GetAircraftsResponseType }
     * 
     */
    public GetAircraftsResponseType createGetAircraftsResponseType() {
        return new GetAircraftsResponseType();
    }

    /**
     * Create an instance of {@link GetPassengerRequestType }
     * 
     */
    public GetPassengerRequestType createGetPassengerRequestType() {
        return new GetPassengerRequestType();
    }

    /**
     * Create an instance of {@link GetFlightsResponseType }
     * 
     */
    public GetFlightsResponseType createGetFlightsResponseType() {
        return new GetFlightsResponseType();
    }

    /**
     * Create an instance of {@link GetInstancesResponseType }
     * 
     */
    public GetInstancesResponseType createGetInstancesResponseType() {
        return new GetInstancesResponseType();
    }

    /**
     * Create an instance of {@link GetInstanceRequestType }
     * 
     */
    public GetInstanceRequestType createGetInstanceRequestType() {
        return new GetInstanceRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsParamErrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "GetFlightsParamErr")
    public JAXBElement<GetFlightsParamErrType> createGetFlightsParamErr(GetFlightsParamErrType value) {
        return new JAXBElement<GetFlightsParamErrType>(_GetFlightsParamErr_QNAME, GetFlightsParamErrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassengersFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getPassengersFault")
    public JAXBElement<GetPassengersFaultType> createGetPassengersFault(GetPassengersFaultType value) {
        return new JAXBElement<GetPassengersFaultType>(_GetPassengersFault_QNAME, GetPassengersFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getAllFault")
    public JAXBElement<GetAllFaultType> createGetAllFault(GetAllFaultType value) {
        return new JAXBElement<GetAllFaultType>(_GetAllFault_QNAME, GetAllFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassengersResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getPassengersResponse")
    public JAXBElement<GetPassengersResponseType> createGetPassengersResponse(GetPassengersResponseType value) {
        return new JAXBElement<GetPassengersResponseType>(_GetPassengersResponse_QNAME, GetPassengersResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getFlightResponse")
    public JAXBElement<GetFlightResponseType> createGetFlightResponse(GetFlightResponseType value) {
        return new JAXBElement<GetFlightResponseType>(_GetFlightResponse_QNAME, GetFlightResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getFlights")
    public JAXBElement<GetFlightsRequestType> createGetFlights(GetFlightsRequestType value) {
        return new JAXBElement<GetFlightsRequestType>(_GetFlights_QNAME, GetFlightsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getFlightFault")
    public JAXBElement<GetFlightFaultType> createGetFlightFault(GetFlightFaultType value) {
        return new JAXBElement<GetFlightFaultType>(_GetFlightFault_QNAME, GetFlightFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAircraftsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getAircrafts")
    public JAXBElement<GetAircraftsRequestType> createGetAircrafts(GetAircraftsRequestType value) {
        return new JAXBElement<GetAircraftsRequestType>(_GetAircrafts_QNAME, GetAircraftsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInstanceFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getInstanceFault")
    public JAXBElement<GetInstanceFaultType> createGetInstanceFault(GetInstanceFaultType value) {
        return new JAXBElement<GetInstanceFaultType>(_GetInstanceFault_QNAME, GetInstanceFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassengerResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getPassengerResponse")
    public JAXBElement<GetPassengerResponseType> createGetPassengerResponse(GetPassengerResponseType value) {
        return new JAXBElement<GetPassengerResponseType>(_GetPassengerResponse_QNAME, GetPassengerResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInstancesFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getInstancesFault")
    public JAXBElement<GetInstancesFaultType> createGetInstancesFault(GetInstancesFaultType value) {
        return new JAXBElement<GetInstancesFaultType>(_GetInstancesFault_QNAME, GetInstancesFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassengerFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getPassengerFault")
    public JAXBElement<GetPassengerFaultType> createGetPassengerFault(GetPassengerFaultType value) {
        return new JAXBElement<GetPassengerFaultType>(_GetPassengerFault_QNAME, GetPassengerFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassengersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getPassengers")
    public JAXBElement<GetPassengersType> createGetPassengers(GetPassengersType value) {
        return new JAXBElement<GetPassengersType>(_GetPassengers_QNAME, GetPassengersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAircraftsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getAircraftsResponse")
    public JAXBElement<GetAircraftsResponseType> createGetAircraftsResponse(GetAircraftsResponseType value) {
        return new JAXBElement<GetAircraftsResponseType>(_GetAircraftsResponse_QNAME, GetAircraftsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassengerRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getPassenger")
    public JAXBElement<GetPassengerRequestType> createGetPassenger(GetPassengerRequestType value) {
        return new JAXBElement<GetPassengerRequestType>(_GetPassenger_QNAME, GetPassengerRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getFlightsResponse")
    public JAXBElement<GetFlightsResponseType> createGetFlightsResponse(GetFlightsResponseType value) {
        return new JAXBElement<GetFlightsResponseType>(_GetFlightsResponse_QNAME, GetFlightsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInstancesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getInstancesResponse")
    public JAXBElement<GetInstancesResponseType> createGetInstancesResponse(GetInstancesResponseType value) {
        return new JAXBElement<GetInstancesResponseType>(_GetInstancesResponse_QNAME, GetInstancesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInstanceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getInstance")
    public JAXBElement<GetInstanceRequestType> createGetInstance(GetInstanceRequestType value) {
        return new JAXBElement<GetInstanceRequestType>(_GetInstance_QNAME, GetInstanceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInstancesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getInstances")
    public JAXBElement<GetInstancesRequestType> createGetInstances(GetInstancesRequestType value) {
        return new JAXBElement<GetInstancesRequestType>(_GetInstances_QNAME, GetInstancesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getAll")
    public JAXBElement<GetAllRequestType> createGetAll(GetAllRequestType value) {
        return new JAXBElement<GetAllRequestType>(_GetAll_QNAME, GetAllRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerAircraftsFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getAircraftsFault")
    public JAXBElement<GerAircraftsFaultType> createGetAircraftsFault(GerAircraftsFaultType value) {
        return new JAXBElement<GerAircraftsFaultType>(_GetAircraftsFault_QNAME, GerAircraftsFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getFlightsFault")
    public JAXBElement<GetFlightsFaultType> createGetFlightsFault(GetFlightsFaultType value) {
        return new JAXBElement<GetFlightsFaultType>(_GetFlightsFault_QNAME, GetFlightsFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getAllResponse")
    public JAXBElement<GetAllResponseType> createGetAllResponse(GetAllResponseType value) {
        return new JAXBElement<GetAllResponseType>(_GetAllResponse_QNAME, GetAllResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInstanceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getInstanceResponse")
    public JAXBElement<GetInstanceResponseType> createGetInstanceResponse(GetInstanceResponseType value) {
        return new JAXBElement<GetInstanceResponseType>(_GetInstanceResponse_QNAME, GetInstanceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSInfo/", name = "getFlight")
    public JAXBElement<GetFlightRequestType> createGetFlight(GetFlightRequestType value) {
        return new JAXBElement<GetFlightRequestType>(_GetFlight_QNAME, GetFlightRequestType.class, null, value);
    }

}
