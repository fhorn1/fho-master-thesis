
package org.goafabric.model.generated;

import jakarta.xml.bind.annotation.XmlElement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ehd_root_typ complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ehd_root_typ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{urn:ehd/001}ehd_header_typ"/>
 *         &lt;element name="body" type="{urn:ehd/001}ehd_body_typ"/>
 *         &lt;element ref="{urn:ehd/001}keytabs" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ehd_version" use="required" type="{urn:ehd/001}ehd_version_typ" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ehd_root_typ", propOrder = {
    "header",
    "body",
    "keytabs"
})
@XmlSeeAlso({
    OpsRootTyp.class
})
public class EhdRootTyp {

    @XmlElement(required = true)
    protected EhdHeaderTyp header;
    @XmlElement(required = true)
    protected EhdBodyTyp body;
    protected KeytabsTyp keytabs;
    @XmlAttribute(name = "ehd_version", required = true)
    protected String ehdVersion;

    /**
     * Ruft den Wert der header-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EhdHeaderTyp }
     *     
     */
    public EhdHeaderTyp getHeader() {
        return header;
    }

    /**
     * Legt den Wert der header-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EhdHeaderTyp }
     *     
     */
    public void setHeader(EhdHeaderTyp value) {
        this.header = value;
    }

    /**
     * Ruft den Wert der body-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EhdBodyTyp }
     *     
     */
    public EhdBodyTyp getBody() {
        return body;
    }

    /**
     * Legt den Wert der body-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EhdBodyTyp }
     *     
     */
    public void setBody(EhdBodyTyp value) {
        this.body = value;
    }

    /**
     * Ruft den Wert der keytabs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KeytabsTyp }
     *     
     */
    public KeytabsTyp getKeytabs() {
        return keytabs;
    }

    /**
     * Legt den Wert der keytabs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KeytabsTyp }
     *     
     */
    public void setKeytabs(KeytabsTyp value) {
        this.keytabs = value;
    }

    /**
     * Ruft den Wert der ehdVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEhdVersion() {
        return ehdVersion;
    }

    /**
     * Legt den Wert der ehdVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEhdVersion(String value) {
        this.ehdVersion = value;
    }

}
