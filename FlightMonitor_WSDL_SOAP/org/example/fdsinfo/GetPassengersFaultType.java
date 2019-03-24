
package org.example.fdsinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPassengersFaultType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPassengersFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengersFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPassengersFaultType", propOrder = {
    "passengersFault"
})
public class GetPassengersFaultType {

    @XmlElement(name = "PassengersFault", required = true)
    protected String passengersFault;

    /**
     * Obtiene el valor de la propiedad passengersFault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengersFault() {
        return passengersFault;
    }

    /**
     * Define el valor de la propiedad passengersFault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengersFault(String value) {
        this.passengersFault = value;
    }

}
