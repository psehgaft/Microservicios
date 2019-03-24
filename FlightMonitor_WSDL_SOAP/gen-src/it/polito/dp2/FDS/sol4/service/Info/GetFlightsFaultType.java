
package it.polito.dp2.FDS.sol4.service.Info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFlightsFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFlightsFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightsError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightsFaultType", propOrder = {
    "flightsError"
})
public class GetFlightsFaultType {

    @XmlElement(name = "FlightsError", required = true)
    protected String flightsError;

    /**
     * Gets the value of the flightsError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightsError() {
        return flightsError;
    }

    /**
     * Sets the value of the flightsError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightsError(String value) {
        this.flightsError = value;
    }

}
