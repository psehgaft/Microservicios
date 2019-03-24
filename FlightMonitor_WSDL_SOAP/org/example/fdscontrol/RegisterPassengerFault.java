
package org.example.fdscontrol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegisterPassengerFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registerPassengerFault"
})
@XmlRootElement(name = "RegisterPassengerFault")
public class RegisterPassengerFault {

    @XmlElement(name = "RegisterPassengerFault", required = true)
    protected String registerPassengerFault;

    /**
     * Obtiene el valor de la propiedad registerPassengerFault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterPassengerFault() {
        return registerPassengerFault;
    }

    /**
     * Define el valor de la propiedad registerPassengerFault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterPassengerFault(String value) {
        this.registerPassengerFault = value;
    }

}
