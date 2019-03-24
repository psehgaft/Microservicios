
package it.polito.dp2.FDS.sol4.service.Info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gerAircraftsFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gerAircraftsFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AircraftsError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gerAircraftsFaultType", propOrder = {
    "aircraftsError"
})
public class GerAircraftsFaultType {

    @XmlElement(name = "AircraftsError", required = true)
    protected String aircraftsError;

    /**
     * Gets the value of the aircraftsError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftsError() {
        return aircraftsError;
    }

    /**
     * Sets the value of the aircraftsError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftsError(String value) {
        this.aircraftsError = value;
    }

}
