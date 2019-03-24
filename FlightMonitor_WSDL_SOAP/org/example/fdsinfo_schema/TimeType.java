
package org.example.fdsinfo_schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para timeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="timeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hour" type="{http://www.example.org/FDSInfo_schema/}hourType"/>
 *         &lt;element name="minute" type="{http://www.example.org/FDSInfo_schema/}minuteType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeType", propOrder = {
    "hour",
    "minute"
})
public class TimeType {

    @XmlSchemaType(name = "integer")
    protected int hour;
    @XmlSchemaType(name = "integer")
    protected int minute;

    /**
     * Obtiene el valor de la propiedad hour.
     * 
     */
    public int getHour() {
        return hour;
    }

    /**
     * Define el valor de la propiedad hour.
     * 
     */
    public void setHour(int value) {
        this.hour = value;
    }

    /**
     * Obtiene el valor de la propiedad minute.
     * 
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Define el valor de la propiedad minute.
     * 
     */
    public void setMinute(int value) {
        this.minute = value;
    }

}
