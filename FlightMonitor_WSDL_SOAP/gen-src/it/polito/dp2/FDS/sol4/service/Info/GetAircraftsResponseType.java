
package it.polito.dp2.FDS.sol4.service.Info;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.polito.dp2.FDS.sol4.service.xsdpack.AircraftType;


/**
 * <p>Java class for getAircraftsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAircraftsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aircrafts" type="{http://www.example.org/FDSInfo_schema/}aircraftType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAircraftsResponseType", propOrder = {
    "aircrafts"
})
public class GetAircraftsResponseType {

    @XmlElement(name = "Aircrafts")
    protected List<AircraftType> aircrafts;

    /**
     * Gets the value of the aircrafts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircrafts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircrafts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftType }
     * 
     * 
     */
    public List<AircraftType> getAircrafts() {
        if (aircrafts == null) {
            aircrafts = new ArrayList<AircraftType>();
        }
        return this.aircrafts;
    }

}
