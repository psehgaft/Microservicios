
package org.example.fdsinfo_schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para passengerReaderType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="passengerReaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.example.org/FDSInfo_schema/}stringType"/>
 *         &lt;element name="seatID" type="{http://www.example.org/FDSInfo_schema/}seatType"/>
 *         &lt;element name="boarded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passengerReaderType", propOrder = {
    "name",
    "seatID",
    "boarded"
})
public class PassengerReaderType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String seatID;
    protected boolean boarded;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad seatID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatID() {
        return seatID;
    }

    /**
     * Define el valor de la propiedad seatID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatID(String value) {
        this.seatID = value;
    }

    /**
     * Obtiene el valor de la propiedad boarded.
     * 
     */
    public boolean isBoarded() {
        return boarded;
    }

    /**
     * Define el valor de la propiedad boarded.
     * 
     */
    public void setBoarded(boolean value) {
        this.boarded = value;
    }

}
