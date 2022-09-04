
package org.goafabric.model.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für patient_typ complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="patient_typ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patient.type_cd" type="{urn:ehd/001}v_s_string_typ" minOccurs="0"/>
 *         &lt;element ref="{urn:ehd/001}person"/>
 *         &lt;element name="birth_dttm" type="{urn:ehd/001}v_date_typ" minOccurs="0"/>
 *         &lt;element name="administrative_gender_cd" type="{urn:ehd/001}v_s_string_typ" minOccurs="0"/>
 *         &lt;element ref="{urn:ehd/001}local_header" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patient_typ", propOrder = {
    "patientTypeCd",
    "person",
    "birthDttm",
    "administrativeGenderCd",
    "localHeader"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PatientTyp {

    @XmlElement(name = "patient.type_cd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected VSStringTyp patientTypeCd;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PersonTyp person;
    @XmlElement(name = "birth_dttm")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected VDateTyp birthDttm;
    @XmlElement(name = "administrative_gender_cd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected VSStringTyp administrativeGenderCd;
    @XmlElement(name = "local_header")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected LocalHeaderContModel localHeader;

    /**
     * Ruft den Wert der patientTypeCd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VSStringTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public VSStringTyp getPatientTypeCd() {
        return patientTypeCd;
    }

    /**
     * Legt den Wert der patientTypeCd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VSStringTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPatientTypeCd(VSStringTyp value) {
        this.patientTypeCd = value;
    }

    /**
     * Ruft den Wert der person-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PersonTyp getPerson() {
        return person;
    }

    /**
     * Legt den Wert der person-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPerson(PersonTyp value) {
        this.person = value;
    }

    /**
     * Ruft den Wert der birthDttm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VDateTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public VDateTyp getBirthDttm() {
        return birthDttm;
    }

    /**
     * Legt den Wert der birthDttm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VDateTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBirthDttm(VDateTyp value) {
        this.birthDttm = value;
    }

    /**
     * Ruft den Wert der administrativeGenderCd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VSStringTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public VSStringTyp getAdministrativeGenderCd() {
        return administrativeGenderCd;
    }

    /**
     * Legt den Wert der administrativeGenderCd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VSStringTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAdministrativeGenderCd(VSStringTyp value) {
        this.administrativeGenderCd = value;
    }

    /**
     * Ruft den Wert der localHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocalHeaderContModel }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public LocalHeaderContModel getLocalHeader() {
        return localHeader;
    }

    /**
     * Legt den Wert der localHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalHeaderContModel }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLocalHeader(LocalHeaderContModel value) {
        this.localHeader = value;
    }

}
