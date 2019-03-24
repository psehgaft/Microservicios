
package org.example.fdsinfo_schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para flightInstanceReaderType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flightInstanceReaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightID" type="{http://www.example.org/FDSInfo_schema/}flightNumberType"/>
 *         &lt;element name="aircraftID" type="{http://www.example.org/FDSInfo_schema/}modelType"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="delay" type="{http://www.example.org/FDSInfo_schema/}delayType"/>
 *         &lt;element name="departureGate" type="{http://www.example.org/FDSInfo_schema/}stringType"/>
 *         &lt;element name="status" type="{http://www.example.org/FDSInfo_schema/}statusType"/>
 *         &lt;element name="Passengers" type="{http://www.example.org/FDSInfo_schema/}PassengersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightInstanceReaderType", propOrder = {
    "flightID",
    "aircraftID",
    "date",
    "delay",
    "departureGate",
    "status",
    "passengers"
})
public class FlightInstanceReaderType {

    @XmlElement(required = true)
    protected String flightID;
    @XmlElement(required = true)
    protected String aircraftID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(required = true)
    protected BigInteger delay;
    @XmlElement(required = true)
    protected String departureGate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StatusType status;
    @XmlElement(name = "Passengers", required = true)
    protected PassengersType passengers;

    /**
     * Obtiene el valor de la propiedad flightID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightID() {
        return flightID;
    }

    /**
     * Define el valor de la propiedad flightID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightID(String value) {
        this.flightID = value;
    }

    /**
     * Obtiene el valor de la propiedad aircraftID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftID() {
        return aircraftID;
    }

    /**
     * Define el valor de la propiedad aircraftID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftID(String value) {
        this.aircraftID = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Obtiene el valor de la propiedad delay.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDelay() {
        return delay;
    }

    /**
     * Define el valor de la propiedad delay.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDelay(BigInteger value) {
        this.delay = value;
    }

    /**
     * Obtiene el valor de la propiedad departureGate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureGate() {
        return departureGate;
    }

    /**
     * Define el valor de la propiedad departureGate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureGate(String value) {
        this.departureGate = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad passengers.
     * 
     * @return
     *     possible object is
     *     {@link PassengersType }
     *     
     */
    public PassengersType getPassengers() {
        return passengers;
    }

    /**
     * Define el valor de la propiedad passengers.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengersType }
     *     
     */
    public void setPassengers(PassengersType value) {
        this.passengers = value;
    }

}
