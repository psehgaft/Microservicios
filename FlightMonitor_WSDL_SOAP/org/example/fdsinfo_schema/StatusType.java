
package org.example.fdsinfo_schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para statusType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="statusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARRIVED"/>
 *     &lt;enumeration value="BOARDING"/>
 *     &lt;enumeration value="BOOKING"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="CHECKINGIN"/>
 *     &lt;enumeration value="DEPARTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusType")
@XmlEnum
public enum StatusType {

    ARRIVED,
    BOARDING,
    BOOKING,
    CANCELLED,
    CHECKINGIN,
    DEPARTED;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}
