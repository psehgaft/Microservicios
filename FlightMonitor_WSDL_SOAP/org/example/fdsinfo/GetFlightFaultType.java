
package org.example.fdsinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getFlightFaultType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFlightFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightFaultType", propOrder = {
    "flightError"
})
public class GetFlightFaultType {

    @XmlElement(name = "FlightError", required = true)
    protected String flightError;

    /**
     * Obtiene el valor de la propiedad flightError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightError() {
        return flightError;
    }

    /**
     * Define el valor de la propiedad flightError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightError(String value) {
        this.flightError = value;
    }

}
