
package org.goafabric.model.generated;

import javax.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für v_s_string_typ complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="v_s_string_typ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="V" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="S" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SV" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "v_s_string_typ")
@XmlSeeAlso({
    TransltnTyp.class,
    DocumentTypeCdTyp.class,
    FunctionCdTyp.class,
    StateTyp.class,
    GroupTyp.class,
    IntendedRecipientTypeCdTyp.class,
    ScopeTypeCdTyp.class,
    DocumentRelationshipTypeCdTyp.class,
    OriginatorTypeCdTyp.class,
    ProviderTypeCdTyp.class
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class VSStringTyp {

    @XmlAttribute(name = "V", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String v;
    @XmlAttribute(name = "DN")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String dn;
    @XmlAttribute(name = "S")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String s;
    @XmlAttribute(name = "SN")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String sn;
    @XmlAttribute(name = "SV")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String sv;

    /**
     * Ruft den Wert der v-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getV() {
        return v;
    }

    /**
     * Legt den Wert der v-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setV(String value) {
        this.v = value;
    }

    /**
     * Ruft den Wert der dn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDN() {
        return dn;
    }

    /**
     * Legt den Wert der dn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDN(String value) {
        this.dn = value;
    }

    /**
     * Ruft den Wert der s-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getS() {
        return s;
    }

    /**
     * Legt den Wert der s-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setS(String value) {
        this.s = value;
    }

    /**
     * Ruft den Wert der sn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getSN() {
        return sn;
    }

    /**
     * Legt den Wert der sn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSN(String value) {
        this.sn = value;
    }

    /**
     * Ruft den Wert der sv-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getSV() {
        return sv;
    }

    /**
     * Legt den Wert der sv-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSV(String value) {
        this.sv = value;
    }

}
