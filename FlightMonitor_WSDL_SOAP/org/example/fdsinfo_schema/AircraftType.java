
package org.example.fdsinfo_schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aircraftType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aircraftType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="model" type="{http://www.example.org/FDSInfo_schema/}modelType"/>
 *         &lt;element name="seats" type="{http://www.example.org/FDSInfo_schema/}seatsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aircraftType", propOrder = {
    "model",
    "seats"
})
public class AircraftType {

    @XmlElement(required = true)
    protected String model;
    @XmlElement(required = true)
    protected SeatsType seats;

    /**
     * Obtiene el valor de la propiedad model.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Define el valor de la propiedad model.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Obtiene el valor de la propiedad seats.
     * 
     * @return
     *     possible object is
     *     {@link SeatsType }
     *     
     */
    public SeatsType getSeats() {
        return seats;
    }

    /**
     * Define el valor de la propiedad seats.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatsType }
     *     
     */
    public void setSeats(SeatsType value) {
        this.seats = value;
    }

}
