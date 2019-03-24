
package org.example.fdsinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para gerAircraftsFaultType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="gerAircraftsFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AircraftsError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gerAircraftsFaultType", propOrder = {
    "aircraftsError"
})
public class GerAircraftsFaultType {

    @XmlElement(name = "AircraftsError", required = true)
    protected String aircraftsError;

    /**
     * Obtiene el valor de la propiedad aircraftsError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftsError() {
        return aircraftsError;
    }

    /**
     * Define el valor de la propiedad aircraftsError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftsError(String value) {
        this.aircraftsError = value;
    }

}
