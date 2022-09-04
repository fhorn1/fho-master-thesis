
package org.goafabric.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für scope_typ complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="scope_typ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:ehd/001}scope_id_typ" maxOccurs="unbounded"/>
 *         &lt;element name="scope.type_cd" type="{urn:ehd/001}scope.type_cd_typ"/>
 *         &lt;element name="scope.nm" type="{urn:ehd/001}v_string_typ" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ehd/001}local_header" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scope_typ", propOrder = {
    "id",
    "scopeTypeCd",
    "scopeNm",
    "localHeader"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class ScopeTyp {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<ScopeIdTyp> id;
    @XmlElement(name = "scope.type_cd", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ScopeTypeCdTyp scopeTypeCd;
    @XmlElement(name = "scope.nm")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<VStringTyp> scopeNm;
    @XmlElement(name = "local_header")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<LocalHeaderContModel> localHeader;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScopeIdTyp }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<ScopeIdTyp> getId() {
        if (id == null) {
            id = new ArrayList<ScopeIdTyp>();
        }
        return this.id;
    }

    /**
     * Ruft den Wert der scopeTypeCd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScopeTypeCdTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ScopeTypeCdTyp getScopeTypeCd() {
        return scopeTypeCd;
    }

    /**
     * Legt den Wert der scopeTypeCd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeTypeCdTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setScopeTypeCd(ScopeTypeCdTyp value) {
        this.scopeTypeCd = value;
    }

    /**
     * Gets the value of the scopeNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scopeNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScopeNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VStringTyp }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<VStringTyp> getScopeNm() {
        if (scopeNm == null) {
            scopeNm = new ArrayList<VStringTyp>();
        }
        return this.scopeNm;
    }

    /**
     * Gets the value of the localHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalHeaderContModel }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<LocalHeaderContModel> getLocalHeader() {
        if (localHeader == null) {
            localHeader = new ArrayList<LocalHeaderContModel>();
        }
        return this.localHeader;
    }

}
