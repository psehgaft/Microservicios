
package org.example.fdsinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.example.fdsinfo_schema.FlightInstanceReaderType;


/**
 * <p>Clase Java para getInstancesResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getInstancesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightInstances" type="{http://www.example.org/FDSInfo_schema/}flightInstanceReaderType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInstancesResponseType", propOrder = {
    "flightInstances"
})
public class GetInstancesResponseType {

    @XmlElement(name = "FlightInstances")
    protected List<FlightInstanceReaderType> flightInstances;

    /**
     * Gets the value of the flightInstances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInstances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightInstanceReaderType }
     * 
     * 
     */
    public List<FlightInstanceReaderType> getFlightInstances() {
        if (flightInstances == null) {
            flightInstances = new ArrayList<FlightInstanceReaderType>();
        }
        return this.flightInstances;
    }

}
