
package it.polito.dp2.FDS.sol4.service.Info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllFaultType", propOrder = {
    "allError"
})
public class GetAllFaultType {

    @XmlElement(name = "AllError", required = true)
    protected String allError;

    /**
     * Gets the value of the allError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllError() {
        return allError;
    }

    /**
     * Sets the value of the allError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllError(String value) {
        this.allError = value;
    }

}
