
package org.example.fdsinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.example.fdsinfo_schema.FlightInstanceReaderType;


/**
 * <p>Clase Java para getInstanceResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getInstanceResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightInstance" type="{http://www.example.org/FDSInfo_schema/}flightInstanceReaderType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInstanceResponseType", propOrder = {
    "flightInstance"
})
public class GetInstanceResponseType {

    @XmlElement(name = "FlightInstance", required = true)
    protected FlightInstanceReaderType flightInstance;

    /**
     * Obtiene el valor de la propiedad flightInstance.
     * 
     * @return
     *     possible object is
     *     {@link FlightInstanceReaderType }
     *     
     */
    public FlightInstanceReaderType getFlightInstance() {
        return flightInstance;
    }

    /**
     * Define el valor de la propiedad flightInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInstanceReaderType }
     *     
     */
    public void setFlightInstance(FlightInstanceReaderType value) {
        this.flightInstance = value;
    }

}
