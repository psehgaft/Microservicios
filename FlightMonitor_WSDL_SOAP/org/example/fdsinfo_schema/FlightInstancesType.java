
package org.example.fdsinfo_schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FlightInstancesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FlightInstancesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightInstanceReader" type="{http://www.example.org/FDSInfo_schema/}flightInstanceReaderType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInstancesType", propOrder = {
    "flightInstanceReader"
})
public class FlightInstancesType {

    @XmlElement(required = true)
    protected List<FlightInstanceReaderType> flightInstanceReader;

    /**
     * Gets the value of the flightInstanceReader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInstanceReader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightInstanceReader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightInstanceReaderType }
     * 
     * 
     */
    public List<FlightInstanceReaderType> getFlightInstanceReader() {
        if (flightInstanceReader == null) {
            flightInstanceReader = new ArrayList<FlightInstanceReaderType>();
        }
        return this.flightInstanceReader;
    }

}
