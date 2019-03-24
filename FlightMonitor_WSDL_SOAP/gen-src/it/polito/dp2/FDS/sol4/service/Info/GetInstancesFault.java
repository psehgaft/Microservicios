
package it.polito.dp2.FDS.sol4.service.Info;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "getInstancesFault", targetNamespace = "http://www.example.org/FDSInfo/")
public class GetInstancesFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private GetInstancesFaultType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public GetInstancesFault(String message, GetInstancesFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public GetInstancesFault(String message, GetInstancesFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: it.polito.dp2.FDS.sol4.service.Info.GetInstancesFaultType
     */
    public GetInstancesFaultType getFaultInfo() {
        return faultInfo;
    }

}
