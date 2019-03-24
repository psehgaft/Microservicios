
package it.polito.dp2.FDS.sol4.service.Info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.polito.dp2.FDS.sol4.service.xsdpack.FlightMonitorType;


/**
 * <p>Java class for getAllResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightMonitor" type="{http://www.example.org/FDSInfo_schema/}FlightMonitorType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllResponseType", propOrder = {
    "flightMonitor"
})
public class GetAllResponseType {

    @XmlElement(name = "FlightMonitor", required = true)
    protected FlightMonitorType flightMonitor;

    /**
     * Gets the value of the flightMonitor property.
     * 
     * @return
     *     possible object is
     *     {@link FlightMonitorType }
     *     
     */
    public FlightMonitorType getFlightMonitor() {
        return flightMonitor;
    }

    /**
     * Sets the value of the flightMonitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightMonitorType }
     *     
     */
    public void setFlightMonitor(FlightMonitorType value) {
        this.flightMonitor = value;
    }

}
