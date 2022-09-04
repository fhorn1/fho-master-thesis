
package org.goafabric.model.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ignore_typ.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ignore_typ">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="markup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ignore_typ")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum IgnoreTyp {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("markup")
    MARKUP("markup");
    private final String value;

    IgnoreTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IgnoreTyp fromValue(String v) {
        for (IgnoreTyp c: IgnoreTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
