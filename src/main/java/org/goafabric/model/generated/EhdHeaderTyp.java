
package org.goafabric.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * ehd-header
 * 
 * <p>Java-Klasse für ehd_header_typ complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ehd_header_typ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ehd/001}id"/>
 *         &lt;element ref="{urn:ehd/001}set_id" minOccurs="0"/>
 *         &lt;element ref="{urn:ehd/001}version_nbr" minOccurs="0"/>
 *         &lt;element ref="{urn:ehd/001}document_type_cd"/>
 *         &lt;element ref="{urn:ehd/001}service_tmr" minOccurs="0"/>
 *         &lt;element ref="{urn:ehd/001}origination_dttm"/>
 *         &lt;element ref="{urn:ehd/001}document_relationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ehd/001}intended_recipient" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ehd/001}originator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ehd/001}provider" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:ehd/001}scope" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ehd/001}state" minOccurs="0"/>
 *         &lt;element ref="{urn:ehd/001}interface"/>
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
@XmlType(name = "ehd_header_typ", propOrder = {
    "id",
    "setId",
    "versionNbr",
    "documentTypeCd",
    "serviceTmr",
    "originationDttm",
    "documentRelationship",
    "intendedRecipient",
    "originator",
    "provider",
    "scope",
    "state",
    "_interface",
    "localHeader"
})
@XmlSeeAlso({
    SdopsHeaderTyp.class
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class EhdHeaderTyp {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected IdTyp id;
    @XmlElement(name = "set_id")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected IdTyp setId;
    @XmlElement(name = "version_nbr")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected VersionNbrTyp versionNbr;
    @XmlElement(name = "document_type_cd", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DocumentTypeCdTyp documentTypeCd;
    @XmlElement(name = "service_tmr")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ServiceTmrTyp serviceTmr;
    @XmlElement(name = "origination_dttm", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected OriginationDttmTyp originationDttm;
    @XmlElement(name = "document_relationship")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<DocumentRelationshipTyp> documentRelationship;
    @XmlElement(name = "intended_recipient")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<IntendedRecipientTyp> intendedRecipient;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<OriginatorTyp> originator;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<ProviderTyp> provider;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<ScopeTyp> scope;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected StateTyp state;
    @XmlElement(name = "interface", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected InterfaceTyp _interface;
    @XmlElement(name = "local_header")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<LocalHeaderContModel> localHeader;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public IdTyp getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setId(IdTyp value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der setId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public IdTyp getSetId() {
        return setId;
    }

    /**
     * Legt den Wert der setId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSetId(IdTyp value) {
        this.setId = value;
    }

    /**
     * Ruft den Wert der versionNbr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionNbrTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public VersionNbrTyp getVersionNbr() {
        return versionNbr;
    }

    /**
     * Legt den Wert der versionNbr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionNbrTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVersionNbr(VersionNbrTyp value) {
        this.versionNbr = value;
    }

    /**
     * Ruft den Wert der documentTypeCd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeCdTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DocumentTypeCdTyp getDocumentTypeCd() {
        return documentTypeCd;
    }

    /**
     * Legt den Wert der documentTypeCd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeCdTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDocumentTypeCd(DocumentTypeCdTyp value) {
        this.documentTypeCd = value;
    }

    /**
     * Ruft den Wert der serviceTmr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTmrTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ServiceTmrTyp getServiceTmr() {
        return serviceTmr;
    }

    /**
     * Legt den Wert der serviceTmr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTmrTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setServiceTmr(ServiceTmrTyp value) {
        this.serviceTmr = value;
    }

    /**
     * Ruft den Wert der originationDttm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OriginationDttmTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public OriginationDttmTyp getOriginationDttm() {
        return originationDttm;
    }

    /**
     * Legt den Wert der originationDttm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginationDttmTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOriginationDttm(OriginationDttmTyp value) {
        this.originationDttm = value;
    }

    /**
     * Gets the value of the documentRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentRelationshipTyp }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<DocumentRelationshipTyp> getDocumentRelationship() {
        if (documentRelationship == null) {
            documentRelationship = new ArrayList<DocumentRelationshipTyp>();
        }
        return this.documentRelationship;
    }

    /**
     * Gets the value of the intendedRecipient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intendedRecipient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntendedRecipient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntendedRecipientTyp }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<IntendedRecipientTyp> getIntendedRecipient() {
        if (intendedRecipient == null) {
            intendedRecipient = new ArrayList<IntendedRecipientTyp>();
        }
        return this.intendedRecipient;
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
     * Gets the value of the provider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderTyp }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<ProviderTyp> getProvider() {
        if (provider == null) {
            provider = new ArrayList<ProviderTyp>();
        }
        return this.provider;
    }

    /**
     * Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScopeTyp }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<ScopeTyp> getScope() {
        if (scope == null) {
            scope = new ArrayList<ScopeTyp>();
        }
        return this.scope;
    }

    /**
     * Ruft den Wert der state-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StateTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public StateTyp getState() {
        return state;
    }

    /**
     * Legt den Wert der state-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StateTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setState(StateTyp value) {
        this.state = value;
    }

    /**
     * Ruft den Wert der interface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public InterfaceTyp getInterface() {
        return _interface;
    }

    /**
     * Legt den Wert der interface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setInterface(InterfaceTyp value) {
        this._interface = value;
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
