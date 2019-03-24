
package it.polito.dp2.FDS.sol4.service.Control;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancelInstanceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelInstanceResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelInstanceResponseType", propOrder = {
    "returnValue"
})
public class CancelInstanceResponseType {

    protected boolean returnValue;

    /**
     * Gets the value of the returnValue property.
     * 
     */
    public boolean isReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     */
    public void setReturnValue(boolean value) {
        this.returnValue = value;
    }

}
