
package it.polito.dp2.FDS.sol4.service.Info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.polito.dp2.FDS.sol4.service.xsdpack.FlightReaderType;


/**
 * <p>Java class for getFlightResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFlightResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Flight" type="{http://www.example.org/FDSInfo_schema/}flightReaderType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightResponseType", propOrder = {
    "flight"
})
public class GetFlightResponseType {

    @XmlElement(name = "Flight", required = true)
    protected FlightReaderType flight;

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link FlightReaderType }
     *     
     */
    public FlightReaderType getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightReaderType }
     *     
     */
    public void setFlight(FlightReaderType value) {
        this.flight = value;
    }

}
