
package org.example.fdscontrol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cancelInstanceResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad returnValue.
     * 
     */
    public boolean isReturnValue() {
        return returnValue;
    }

    /**
     * Define el valor de la propiedad returnValue.
     * 
     */
    public void setReturnValue(boolean value) {
        this.returnValue = value;
    }

}
