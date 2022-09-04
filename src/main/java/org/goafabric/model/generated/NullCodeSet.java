
package org.goafabric.model.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für null.code.set.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="null.code.set">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NI"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="UNK"/>
 *     &lt;enumeration value="NASK"/>
 *     &lt;enumeration value="ASKU"/>
 *     &lt;enumeration value="NAV"/>
 *     &lt;enumeration value="OTH"/>
 *     &lt;enumeration value="PINF"/>
 *     &lt;enumeration value="NINF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "null.code.set")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum NullCodeSet {

    NI,
    NA,
    UNK,
    NASK,
    ASKU,
    NAV,
    OTH,
    PINF,
    NINF;

    public String value() {
        return name();
    }

    public static NullCodeSet fromValue(String v) {
        return valueOf(v);
    }

}
