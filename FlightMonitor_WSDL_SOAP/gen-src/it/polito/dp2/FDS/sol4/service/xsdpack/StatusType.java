//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.28 at 07:20:13 PM CEST 
//


package it.polito.dp2.FDS.sol4.service.xsdpack;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
