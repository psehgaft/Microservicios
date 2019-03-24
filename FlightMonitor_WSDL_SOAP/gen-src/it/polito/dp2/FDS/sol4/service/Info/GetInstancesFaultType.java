
package it.polito.dp2.FDS.sol4.service.Info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getInstancesFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getInstancesFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstancesError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInstancesFaultType", propOrder = {
    "instancesError"
})
public class GetInstancesFaultType {

    @XmlElement(name = "InstancesError", required = true)
    protected String instancesError;

    /**
     * Gets the value of the instancesError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstancesError() {
        return instancesError;
    }

    /**
     * Sets the value of the instancesError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstancesError(String value) {
        this.instancesError = value;
    }

}
