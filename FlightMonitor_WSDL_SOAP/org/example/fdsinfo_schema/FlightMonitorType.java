
package org.example.fdsinfo_schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FlightMonitorType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FlightMonitorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aircrafts" type="{http://www.example.org/FDSInfo_schema/}AircraftsType"/>
 *         &lt;element name="Flights" type="{http://www.example.org/FDSInfo_schema/}FlightsType"/>
 *         &lt;element name="FlightInstances" type="{http://www.example.org/FDSInfo_schema/}FlightInstancesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightMonitorType", propOrder = {
    "aircrafts",
    "flights",
    "flightInstances"
})
public class FlightMonitorType {

    @XmlElement(name = "Aircrafts", required = true)
    protected AircraftsType aircrafts;
    @XmlElement(name = "Flights", required = true)
    protected FlightsType flights;
    @XmlElement(name = "FlightInstances", required = true)
    protected FlightInstancesType flightInstances;

    /**
     * Obtiene el valor de la propiedad aircrafts.
     * 
     * @return
     *     possible object is
     *     {@link AircraftsType }
     *     
     */
    public AircraftsType getAircrafts() {
        return aircrafts;
    }

    /**
     * Define el valor de la propiedad aircrafts.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftsType }
     *     
     */
    public void setAircrafts(AircraftsType value) {
        this.aircrafts = value;
    }

    /**
     * Obtiene el valor de la propiedad flights.
     * 
     * @return
     *     possible object is
     *     {@link FlightsType }
     *     
     */
    public FlightsType getFlights() {
        return flights;
    }

    /**
     * Define el valor de la propiedad flights.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightsType }
     *     
     */
    public void setFlights(FlightsType value) {
        this.flights = value;
    }

    /**
     * Obtiene el valor de la propiedad flightInstances.
     * 
     * @return
     *     possible object is
     *     {@link FlightInstancesType }
     *     
     */
    public FlightInstancesType getFlightInstances() {
        return flightInstances;
    }

    /**
     * Define el valor de la propiedad flightInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInstancesType }
     *     
     */
    public void setFlightInstances(FlightInstancesType value) {
        this.flightInstances = value;
    }

}
