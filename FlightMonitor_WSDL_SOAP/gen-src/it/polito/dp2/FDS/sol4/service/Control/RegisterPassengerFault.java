
package it.polito.dp2.FDS.sol4.service.Control;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegisterPassengerFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registerPassengerFault"
})
@XmlRootElement(name = "RegisterPassengerFault")
public class RegisterPassengerFault {

    @XmlElement(name = "RegisterPassengerFault", required = true)
    protected String registerPassengerFault;

    /**
     * Gets the value of the registerPassengerFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterPassengerFault() {
        return registerPassengerFault;
    }

    /**
     * Sets the value of the registerPassengerFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterPassengerFault(String value) {
        this.registerPassengerFault = value;
    }

}
