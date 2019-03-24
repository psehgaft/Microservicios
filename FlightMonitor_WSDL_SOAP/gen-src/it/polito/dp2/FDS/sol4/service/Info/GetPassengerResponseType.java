
package it.polito.dp2.FDS.sol4.service.Info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.polito.dp2.FDS.sol4.service.xsdpack.PassengerReaderType;


/**
 * <p>Java class for getPassengerResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPassengerResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Passenger" type="{http://www.example.org/FDSInfo_schema/}passengerReaderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPassengerResponseType", propOrder = {
    "passenger"
})
public class GetPassengerResponseType {

    @XmlElement(name = "Passenger")
    protected PassengerReaderType passenger;

    /**
     * Gets the value of the passenger property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerReaderType }
     *     
     */
    public PassengerReaderType getPassenger() {
        return passenger;
    }

    /**
     * Sets the value of the passenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerReaderType }
     *     
     */
    public void setPassenger(PassengerReaderType value) {
        this.passenger = value;
    }

}
