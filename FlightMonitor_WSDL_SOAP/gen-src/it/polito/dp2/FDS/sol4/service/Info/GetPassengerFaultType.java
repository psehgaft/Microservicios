
package it.polito.dp2.FDS.sol4.service.Info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPassengerFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPassengerFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPassengerFaultType", propOrder = {
    "passengerFault"
})
public class GetPassengerFaultType {

    @XmlElement(name = "PassengerFault", required = true)
    protected String passengerFault;

    /**
     * Gets the value of the passengerFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerFault() {
        return passengerFault;
    }

    /**
     * Sets the value of the passengerFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerFault(String value) {
        this.passengerFault = value;
    }

}
