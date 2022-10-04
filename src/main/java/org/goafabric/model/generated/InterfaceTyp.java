
package org.goafabric.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für interface_typ complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="interface_typ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:ehd/001}interface_id_typ"/>
 *         &lt;element name="interface.nm" type="{urn:ehd/001}interface_nm_typ"/>
 *         &lt;element name="version" type="{urn:ehd/001}interface_version_typ"/>
 *         &lt;element ref="{urn:ehd/001}originator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{urn:ehd/001}description_typ" minOccurs="0"/>
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
@XmlType(name = "interface_typ", propOrder = {
    "id",
    "interfaceNm",
    "version",
    "originator",
    "description",
    "localHeader"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class InterfaceTyp {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected InterfaceIdTyp id;
    @XmlElement(name = "interface.nm", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected InterfaceNmTyp interfaceNm;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected InterfaceVersionTyp version;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<OriginatorTyp> originator;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DescriptionTyp description;
    @XmlElement(name = "local_header")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<LocalHeaderContModel> localHeader;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceIdTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public InterfaceIdTyp getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceIdTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setId(InterfaceIdTyp value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der interfaceNm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceNmTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public InterfaceNmTyp getInterfaceNm() {
        return interfaceNm;
    }

    /**
     * Legt den Wert der interfaceNm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceNmTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setInterfaceNm(InterfaceNmTyp value) {
        this.interfaceNm = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceVersionTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public InterfaceVersionTyp getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceVersionTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVersion(InterfaceVersionTyp value) {
        this.version = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginatorTyp }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<OriginatorTyp> getOriginator() {
        if (originator == null) {
            originator = new ArrayList<OriginatorTyp>();
        }
        return this.originator;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DescriptionTyp getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDescription(DescriptionTyp value) {
        this.description = value;
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
