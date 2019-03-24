
package org.example.fdscontrol;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CheckinOperationResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CheckinOperationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seat" type="{http://www.example.org/FDSInfo_schema/}seatType"/>
 *         &lt;element name="gate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delay" type="{http://www.example.org/FDSInfo_schema/}delayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckinOperationResponseType", propOrder = {
    "name",
    "seat",
    "gate",
    "delay"
})
public class CheckinOperationResponseType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String seat;
    protected String gate;
    protected BigInteger delay;

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
     * Obtiene el valor de la propiedad seat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeat() {
        return seat;
    }

    /**
     * Define el valor de la propiedad seat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeat(String value) {
        this.seat = value;
    }

    /**
     * Obtiene el valor de la propiedad gate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGate() {
        return gate;
    }

    /**
     * Define el valor de la propiedad gate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGate(String value) {
        this.gate = value;
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

}
