
package org.example.fdsinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPassengerFaultType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPassengerFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPassengerFaultType", propOrder = {
    "passengerFault"
})
public class GetPassengerFaultType {

    @XmlElement(name = "PassengerFault", required = true)
    protected String passengerFault;

    /**
     * Obtiene el valor de la propiedad passengerFault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerFault() {
        return passengerFault;
    }

    /**
     * Define el valor de la propiedad passengerFault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerFault(String value) {
        this.passengerFault = value;
    }

}
