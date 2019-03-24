
package it.polito.dp2.FDS.sol4.service.Control;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.polito.dp2.FDS.sol4.service.Control package. 
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

    private final static QName _BoardingInstance_QNAME = new QName("http://www.example.org/FDSControl/", "BoardingInstance");
    private final static QName _CheckInOperationResponse_QNAME = new QName("http://www.example.org/FDSControl/", "CheckInOperationResponse");
    private final static QName _CancelInstance_QNAME = new QName("http://www.example.org/FDSControl/", "cancelInstance");
    private final static QName _GetPassengers_QNAME = new QName("http://www.example.org/FDSControl/", "getPassengers");
    private final static QName _RegisterPassengerRequest_QNAME = new QName("http://www.example.org/FDSControl/", "RegisterPassengerRequest");
    private final static QName _GetPassengersResponse_QNAME = new QName("http://www.example.org/FDSControl/", "getPassengersResponse");
    private final static QName _RegisterInstanceNotFoundError_QNAME = new QName("http://www.example.org/FDSControl/", "RegisterInstanceNotFoundError");
    private final static QName _InstanceNotBookedFaultType_QNAME = new QName("http://www.example.org/FDSControl/", "InstanceNotBookedFaultType");
    private final static QName _CancelInstanceResponse_QNAME = new QName("http://www.example.org/FDSControl/", "cancelInstanceResponse");
    private final static QName _CheckInOperation_QNAME = new QName("http://www.example.org/FDSControl/", "CheckInOperation");
    private final static QName _ChangeGate_QNAME = new QName("http://www.example.org/FDSControl/", "ChangeGate");
    private final static QName _RegisterPassengerNotFound_QNAME = new QName("http://www.example.org/FDSControl/", "RegisterPassengerNotFound");
    private final static QName _RegisterPassengerResponse_QNAME = new QName("http://www.example.org/FDSControl/", "RegisterPassengerResponse");
    private final static QName _InstanceYetBoardedError_QNAME = new QName("http://www.example.org/FDSControl/", "InstanceYetBoardedError");
    private final static QName _ChangeDelayResponse_QNAME = new QName("http://www.example.org/FDSControl/", "ChangeDelayResponse");
    private final static QName _BoardingInstanceResponse_QNAME = new QName("http://www.example.org/FDSControl/", "BoardingInstanceResponse");
    private final static QName _PassengerAlreadyCheckinError_QNAME = new QName("http://www.example.org/FDSControl/", "PassengerAlreadyCheckinError");
    private final static QName _InstanceNotFoundError_QNAME = new QName("http://www.example.org/FDSControl/", "InstanceNotFoundError");
    private final static QName _ChangeDelay_QNAME = new QName("http://www.example.org/FDSControl/", "ChangeDelay");
    private final static QName _ServiceUnavableError_QNAME = new QName("http://www.example.org/FDSControl/", "ServiceUnavableError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.polito.dp2.FDS.sol4.service.Control
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPassengersRequestType }
     * 
     */
    public GetPassengersRequestType createGetPassengersRequestType() {
        return new GetPassengersRequestType();
    }

    /**
     * Create an instance of {@link RegisterPassengerRequestType }
     * 
     */
    public RegisterPassengerRequestType createRegisterPassengerRequestType() {
        return new RegisterPassengerRequestType();
    }

    /**
     * Create an instance of {@link CheckinOperationResponseType }
     * 
     */
    public CheckinOperationResponseType createCheckinOperationResponseType() {
        return new CheckinOperationResponseType();
    }

    /**
     * Create an instance of {@link CancelInstanceType }
     * 
     */
    public CancelInstanceType createCancelInstanceType() {
        return new CancelInstanceType();
    }

    /**
     * Create an instance of {@link ChangeGateResponse }
     * 
     */
    public ChangeGateResponse createChangeGateResponse() {
        return new ChangeGateResponse();
    }

    /**
     * Create an instance of {@link BoardingInstanceRequest }
     * 
     */
    public BoardingInstanceRequest createBoardingInstanceRequest() {
        return new BoardingInstanceRequest();
    }

    /**
     * Create an instance of {@link CheckInOperationRequestType }
     * 
     */
    public CheckInOperationRequestType createCheckInOperationRequestType() {
        return new CheckInOperationRequestType();
    }

    /**
     * Create an instance of {@link ChangeGateRequestType }
     * 
     */
    public ChangeGateRequestType createChangeGateRequestType() {
        return new ChangeGateRequestType();
    }

    /**
     * Create an instance of {@link InstanceNotBookedErrorType }
     * 
     */
    public InstanceNotBookedErrorType createInstanceNotBookedErrorType() {
        return new InstanceNotBookedErrorType();
    }

    /**
     * Create an instance of {@link CancelInstanceResponseType }
     * 
     */
    public CancelInstanceResponseType createCancelInstanceResponseType() {
        return new CancelInstanceResponseType();
    }

    /**
     * Create an instance of {@link GetPassengersResponseType }
     * 
     */
    public GetPassengersResponseType createGetPassengersResponseType() {
        return new GetPassengersResponseType();
    }

    /**
     * Create an instance of {@link RegisterInstanceNotFoundErrorType }
     * 
     */
    public RegisterInstanceNotFoundErrorType createRegisterInstanceNotFoundErrorType() {
        return new RegisterInstanceNotFoundErrorType();
    }

    /**
     * Create an instance of {@link BoardinInstanceResponseType }
     * 
     */
    public BoardinInstanceResponseType createBoardinInstanceResponseType() {
        return new BoardinInstanceResponseType();
    }

    /**
     * Create an instance of {@link ChangeDelayResponseType }
     * 
     */
    public ChangeDelayResponseType createChangeDelayResponseType() {
        return new ChangeDelayResponseType();
    }

    /**
     * Create an instance of {@link BoardingInstanceFault }
     * 
     */
    public BoardingInstanceFault createBoardingInstanceFault() {
        return new BoardingInstanceFault();
    }

    /**
     * Create an instance of {@link InstanceYetBoardedErrorType }
     * 
     */
    public InstanceYetBoardedErrorType createInstanceYetBoardedErrorType() {
        return new InstanceYetBoardedErrorType();
    }

    /**
     * Create an instance of {@link RegisterPassengerResponseType }
     * 
     */
    public RegisterPassengerResponseType createRegisterPassengerResponseType() {
        return new RegisterPassengerResponseType();
    }

    /**
     * Create an instance of {@link RegisterPassengerNotFoundType }
     * 
     */
    public RegisterPassengerNotFoundType createRegisterPassengerNotFoundType() {
        return new RegisterPassengerNotFoundType();
    }

    /**
     * Create an instance of {@link ServiceUnavabileErrorType }
     * 
     */
    public ServiceUnavabileErrorType createServiceUnavabileErrorType() {
        return new ServiceUnavabileErrorType();
    }

    /**
     * Create an instance of {@link ChangeDelayRequestType }
     * 
     */
    public ChangeDelayRequestType createChangeDelayRequestType() {
        return new ChangeDelayRequestType();
    }

    /**
     * Create an instance of {@link InstanceNotFoundError }
     * 
     */
    public InstanceNotFoundError createInstanceNotFoundError() {
        return new InstanceNotFoundError();
    }

    /**
     * Create an instance of {@link PassengerAlreadyCheckinErrorType }
     * 
     */
    public PassengerAlreadyCheckinErrorType createPassengerAlreadyCheckinErrorType() {
        return new PassengerAlreadyCheckinErrorType();
    }

    /**
     * Create an instance of {@link RegisterPassengerFault }
     * 
     */
    public RegisterPassengerFault createRegisterPassengerFault() {
        return new RegisterPassengerFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoardingInstanceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "BoardingInstance")
    public JAXBElement<BoardingInstanceRequest> createBoardingInstance(BoardingInstanceRequest value) {
        return new JAXBElement<BoardingInstanceRequest>(_BoardingInstance_QNAME, BoardingInstanceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinOperationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "CheckInOperationResponse")
    public JAXBElement<CheckinOperationResponseType> createCheckInOperationResponse(CheckinOperationResponseType value) {
        return new JAXBElement<CheckinOperationResponseType>(_CheckInOperationResponse_QNAME, CheckinOperationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelInstanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "cancelInstance")
    public JAXBElement<CancelInstanceType> createCancelInstance(CancelInstanceType value) {
        return new JAXBElement<CancelInstanceType>(_CancelInstance_QNAME, CancelInstanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassengersRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "getPassengers")
    public JAXBElement<GetPassengersRequestType> createGetPassengers(GetPassengersRequestType value) {
        return new JAXBElement<GetPassengersRequestType>(_GetPassengers_QNAME, GetPassengersRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterPassengerRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "RegisterPassengerRequest")
    public JAXBElement<RegisterPassengerRequestType> createRegisterPassengerRequest(RegisterPassengerRequestType value) {
        return new JAXBElement<RegisterPassengerRequestType>(_RegisterPassengerRequest_QNAME, RegisterPassengerRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassengersResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "getPassengersResponse")
    public JAXBElement<GetPassengersResponseType> createGetPassengersResponse(GetPassengersResponseType value) {
        return new JAXBElement<GetPassengersResponseType>(_GetPassengersResponse_QNAME, GetPassengersResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterInstanceNotFoundErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "RegisterInstanceNotFoundError")
    public JAXBElement<RegisterInstanceNotFoundErrorType> createRegisterInstanceNotFoundError(RegisterInstanceNotFoundErrorType value) {
        return new JAXBElement<RegisterInstanceNotFoundErrorType>(_RegisterInstanceNotFoundError_QNAME, RegisterInstanceNotFoundErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceNotBookedErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "InstanceNotBookedFaultType")
    public JAXBElement<InstanceNotBookedErrorType> createInstanceNotBookedFaultType(InstanceNotBookedErrorType value) {
        return new JAXBElement<InstanceNotBookedErrorType>(_InstanceNotBookedFaultType_QNAME, InstanceNotBookedErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelInstanceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "cancelInstanceResponse")
    public JAXBElement<CancelInstanceResponseType> createCancelInstanceResponse(CancelInstanceResponseType value) {
        return new JAXBElement<CancelInstanceResponseType>(_CancelInstanceResponse_QNAME, CancelInstanceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckInOperationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "CheckInOperation")
    public JAXBElement<CheckInOperationRequestType> createCheckInOperation(CheckInOperationRequestType value) {
        return new JAXBElement<CheckInOperationRequestType>(_CheckInOperation_QNAME, CheckInOperationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeGateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "ChangeGate")
    public JAXBElement<ChangeGateRequestType> createChangeGate(ChangeGateRequestType value) {
        return new JAXBElement<ChangeGateRequestType>(_ChangeGate_QNAME, ChangeGateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterPassengerNotFoundType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "RegisterPassengerNotFound")
    public JAXBElement<RegisterPassengerNotFoundType> createRegisterPassengerNotFound(RegisterPassengerNotFoundType value) {
        return new JAXBElement<RegisterPassengerNotFoundType>(_RegisterPassengerNotFound_QNAME, RegisterPassengerNotFoundType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterPassengerResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "RegisterPassengerResponse")
    public JAXBElement<RegisterPassengerResponseType> createRegisterPassengerResponse(RegisterPassengerResponseType value) {
        return new JAXBElement<RegisterPassengerResponseType>(_RegisterPassengerResponse_QNAME, RegisterPassengerResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceYetBoardedErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "InstanceYetBoardedError")
    public JAXBElement<InstanceYetBoardedErrorType> createInstanceYetBoardedError(InstanceYetBoardedErrorType value) {
        return new JAXBElement<InstanceYetBoardedErrorType>(_InstanceYetBoardedError_QNAME, InstanceYetBoardedErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeDelayResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "ChangeDelayResponse")
    public JAXBElement<ChangeDelayResponseType> createChangeDelayResponse(ChangeDelayResponseType value) {
        return new JAXBElement<ChangeDelayResponseType>(_ChangeDelayResponse_QNAME, ChangeDelayResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoardinInstanceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "BoardingInstanceResponse")
    public JAXBElement<BoardinInstanceResponseType> createBoardingInstanceResponse(BoardinInstanceResponseType value) {
        return new JAXBElement<BoardinInstanceResponseType>(_BoardingInstanceResponse_QNAME, BoardinInstanceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerAlreadyCheckinErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "PassengerAlreadyCheckinError")
    public JAXBElement<PassengerAlreadyCheckinErrorType> createPassengerAlreadyCheckinError(PassengerAlreadyCheckinErrorType value) {
        return new JAXBElement<PassengerAlreadyCheckinErrorType>(_PassengerAlreadyCheckinError_QNAME, PassengerAlreadyCheckinErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceNotFoundError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "InstanceNotFoundError")
    public JAXBElement<InstanceNotFoundError> createInstanceNotFoundError(InstanceNotFoundError value) {
        return new JAXBElement<InstanceNotFoundError>(_InstanceNotFoundError_QNAME, InstanceNotFoundError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeDelayRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "ChangeDelay")
    public JAXBElement<ChangeDelayRequestType> createChangeDelay(ChangeDelayRequestType value) {
        return new JAXBElement<ChangeDelayRequestType>(_ChangeDelay_QNAME, ChangeDelayRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceUnavabileErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/FDSControl/", name = "ServiceUnavableError")
    public JAXBElement<ServiceUnavabileErrorType> createServiceUnavableError(ServiceUnavabileErrorType value) {
        return new JAXBElement<ServiceUnavabileErrorType>(_ServiceUnavableError_QNAME, ServiceUnavabileErrorType.class, null, value);
    }

}
