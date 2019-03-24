
package org.example.fdscontrol;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "RegisterPassengerNotFound", targetNamespace = "http://www.example.org/FDSControl/")
public class RegisterPassengerNotFoundErrorMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RegisterPassengerNotFoundType faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public RegisterPassengerNotFoundErrorMessage(String message, RegisterPassengerNotFoundType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public RegisterPassengerNotFoundErrorMessage(String message, RegisterPassengerNotFoundType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.example.fdscontrol.RegisterPassengerNotFoundType
     */
    public RegisterPassengerNotFoundType getFaultInfo() {
        return faultInfo;
    }

}
