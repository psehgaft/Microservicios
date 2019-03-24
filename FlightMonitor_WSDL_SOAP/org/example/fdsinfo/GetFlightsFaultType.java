
package org.example.fdsinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getFlightsFaultType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFlightsFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightsError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightsFaultType", propOrder = {
    "flightsError"
})
public class GetFlightsFaultType {

    @XmlElement(name = "FlightsError", required = true)
    protected String flightsError;

    /**
     * Obtiene el valor de la propiedad flightsError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightsError() {
        return flightsError;
    }

    /**
     * Define el valor de la propiedad flightsError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightsError(String value) {
        this.flightsError = value;
    }

}
