
package org.example.fdsinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.example.fdsinfo_schema.FlightMonitorType;


/**
 * <p>Clase Java para getAllResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAllResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightMonitor" type="{http://www.example.org/FDSInfo_schema/}FlightMonitorType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllResponseType", propOrder = {
    "flightMonitor"
})
public class GetAllResponseType {

    @XmlElement(name = "FlightMonitor", required = true)
    protected FlightMonitorType flightMonitor;

    /**
     * Obtiene el valor de la propiedad flightMonitor.
     * 
     * @return
     *     possible object is
     *     {@link FlightMonitorType }
     *     
     */
    public FlightMonitorType getFlightMonitor() {
        return flightMonitor;
    }

    /**
     * Define el valor de la propiedad flightMonitor.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightMonitorType }
     *     
     */
    public void setFlightMonitor(FlightMonitorType value) {
        this.flightMonitor = value;
    }

}
