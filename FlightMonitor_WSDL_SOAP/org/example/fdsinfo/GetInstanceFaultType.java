
package org.example.fdsinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getInstanceFaultType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getInstanceFaultType">
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
@XmlType(name = "getInstanceFaultType", propOrder = {
    "instancesError"
})
public class GetInstanceFaultType {

    @XmlElement(name = "InstancesError", required = true)
    protected String instancesError;

    /**
     * Obtiene el valor de la propiedad instancesError.
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
     * Define el valor de la propiedad instancesError.
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
