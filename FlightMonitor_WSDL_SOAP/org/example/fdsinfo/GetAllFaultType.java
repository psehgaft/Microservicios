
package org.example.fdsinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAllFaultType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAllFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllFaultType", propOrder = {
    "allError"
})
public class GetAllFaultType {

    @XmlElement(name = "AllError", required = true)
    protected String allError;

    /**
     * Obtiene el valor de la propiedad allError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllError() {
        return allError;
    }

    /**
     * Define el valor de la propiedad allError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllError(String value) {
        this.allError = value;
    }

}
