
package it.polito.dp2.FDS.sol4.service.Control;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoardingInstanceFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "boardingInstanceFault"
})
@XmlRootElement(name = "BoardingInstanceFault")
public class BoardingInstanceFault {

    @XmlElement(name = "BoardingInstanceFault", required = true)
    protected String boardingInstanceFault;

    /**
     * Gets the value of the boardingInstanceFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingInstanceFault() {
        return boardingInstanceFault;
    }

    /**
     * Sets the value of the boardingInstanceFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardingInstanceFault(String value) {
        this.boardingInstanceFault = value;
    }

}
