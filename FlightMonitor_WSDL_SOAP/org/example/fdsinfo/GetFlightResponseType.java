
package org.example.fdsinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.example.fdsinfo_schema.FlightReaderType;


/**
 * <p>Clase Java para getFlightResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFlightResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Flight" type="{http://www.example.org/FDSInfo_schema/}flightReaderType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightResponseType", propOrder = {
    "flight"
})
public class GetFlightResponseType {

    @XmlElement(name = "Flight", required = true)
    protected FlightReaderType flight;

    /**
     * Obtiene el valor de la propiedad flight.
     * 
     * @return
     *     possible object is
     *     {@link FlightReaderType }
     *     
     */
    public FlightReaderType getFlight() {
        return flight;
    }

    /**
     * Define el valor de la propiedad flight.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightReaderType }
     *     
     */
    public void setFlight(FlightReaderType value) {
        this.flight = value;
    }

}
