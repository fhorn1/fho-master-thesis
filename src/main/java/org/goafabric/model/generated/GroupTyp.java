
package org.goafabric.model.generated;

import javax.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für group_typ complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="group_typ">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ehd/001}v_s_string_typ">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ehd/001}group.type_cd"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "group_typ", propOrder = {
    "groupTypeCd"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class GroupTyp
    extends VSStringTyp
{

    @XmlElement(name = "group.type_cd", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected VSStringTyp groupTypeCd;

    /**
     * Ruft den Wert der groupTypeCd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VSStringTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public VSStringTyp getGroupTypeCd() {
        return groupTypeCd;
    }

    /**
     * Legt den Wert der groupTypeCd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VSStringTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setGroupTypeCd(VSStringTyp value) {
        this.groupTypeCd = value;
    }

}
