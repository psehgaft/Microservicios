
package org.example.fdscontrol;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.example.fdsinfo_schema.PassengerReaderType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FDSControl", targetNamespace = "http://www.example.org/FDSControl/")
@XmlSeeAlso({
    org.example.fdscontrol.ObjectFactory.class,
    org.example.fdsinfo_schema.ObjectFactory.class
})
public interface FDSControl {


    /**
     * 
     * @param date
     * @param flightNumber
     * @return
     *     returns boolean
     * @throws InstanceYetBoardedError
     * @throws InstanceNotFoundMessage
     * @throws ServiceUnavaibleMessage
     */
    @WebMethod(operationName = "BoardingInstance", action = "http://www.example.org/FDSControl/BoardingInstance")
    @WebResult(name = "returnValue", targetNamespace = "")
    @RequestWrapper(localName = "BoardingInstance", targetNamespace = "http://www.example.org/FDSControl/", className = "org.example.fdscontrol.BoardingInstanceRequest")
    @ResponseWrapper(localName = "BoardingInstanceResponse", targetNamespace = "http://www.example.org/FDSControl/", className = "org.example.fdscontrol.BoardinInstanceResponseType")
    public boolean boardingInstance(
        @WebParam(name = "flightNumber", targetNamespace = "")
        String flightNumber,
        @WebParam(name = "date", targetNamespace = "")
        XMLGregorianCalendar date)
        throws InstanceNotFoundMessage, InstanceYetBoardedError, ServiceUnavaibleMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns org.example.fdscontrol.RegisterPassengerResponseType
     * @throws InstanceNotBookedFault
     * @throws ServiceUnavaibleMessage
     * @throws RegisterPassengerNotFoundErrorMessage
     * @throws RegiterInstanceNotFoundError
     */
    @WebMethod(operationName = "RegisterPassenger", action = "http://www.example.org/FDSControl/RegisterPassenger")
    @WebResult(name = "RegisterPassengerResponse", targetNamespace = "http://www.example.org/FDSControl/", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public RegisterPassengerResponseType registerPassenger(
        @WebParam(name = "RegisterPassengerRequest", targetNamespace = "http://www.example.org/FDSControl/", partName = "parameters")
        RegisterPassengerRequestType parameters)
        throws InstanceNotBookedFault, RegisterPassengerNotFoundErrorMessage, RegiterInstanceNotFoundError, ServiceUnavaibleMessage
    ;

    /**
     * 
     * @param date
     * @param flightNumber
     * @return
     *     returns java.util.List<org.example.fdsinfo_schema.PassengerReaderType>
     * @throws InstanceNotFoundMessage
     * @throws ServiceUnavaibleMessage
     */
    @WebMethod(action = "http://www.example.org/FDSControl/getPassengers")
    @WebResult(name = "Passengers", targetNamespace = "")
    @RequestWrapper(localName = "getPassengers", targetNamespace = "http://www.example.org/FDSControl/", className = "org.example.fdscontrol.GetPassengersRequestType")
    @ResponseWrapper(localName = "getPassengersResponse", targetNamespace = "http://www.example.org/FDSControl/", className = "org.example.fdscontrol.GetPassengersResponseType")
    public List<PassengerReaderType> getPassengers(
        @WebParam(name = "date", targetNamespace = "")
        XMLGregorianCalendar date,
        @WebParam(name = "flightNumber", targetNamespace = "")
        String flightNumber)
        throws InstanceNotFoundMessage, ServiceUnavaibleMessage
    ;

}
