
package it.polito.dp2.FDS.sol4.service.Info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPassengersFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPassengersFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengersFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPassengersFaultType", propOrder = {
    "passengersFault"
})
public class GetPassengersFaultType {

    @XmlElement(name = "PassengersFault", required = true)
    protected String passengersFault;

    /**
     * Gets the value of the passengersFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengersFault() {
        return passengersFault;
    }

    /**
     * Sets the value of the passengersFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengersFault(String value) {
        this.passengersFault = value;
    }

}
