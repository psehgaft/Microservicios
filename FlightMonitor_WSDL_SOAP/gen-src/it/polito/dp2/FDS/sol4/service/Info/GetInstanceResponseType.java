
package it.polito.dp2.FDS.sol4.service.Info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.polito.dp2.FDS.sol4.service.xsdpack.FlightInstanceReaderType;


/**
 * <p>Java class for getInstanceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getInstanceResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightInstance" type="{http://www.example.org/FDSInfo_schema/}flightInstanceReaderType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInstanceResponseType", propOrder = {
    "flightInstance"
})
public class GetInstanceResponseType {

    @XmlElement(name = "FlightInstance", required = true)
    protected FlightInstanceReaderType flightInstance;

    /**
     * Gets the value of the flightInstance property.
     * 
     * @return
     *     possible object is
     *     {@link FlightInstanceReaderType }
     *     
     */
    public FlightInstanceReaderType getFlightInstance() {
        return flightInstance;
    }

    /**
     * Sets the value of the flightInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInstanceReaderType }
     *     
     */
    public void setFlightInstance(FlightInstanceReaderType value) {
        this.flightInstance = value;
    }

}
