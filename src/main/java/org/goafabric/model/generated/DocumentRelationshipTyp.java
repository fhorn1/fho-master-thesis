
package org.goafabric.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für document_relationship_typ complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="document_relationship_typ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="document_relationship.type_cd" type="{urn:ehd/001}document_relationship.type_cd_typ"/>
 *         &lt;element ref="{urn:ehd/001}related_document"/>
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
@XmlType(name = "document_relationship_typ", propOrder = {
    "documentRelationshipTypeCd",
    "relatedDocument",
    "localHeader"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DocumentRelationshipTyp {

    @XmlElement(name = "document_relationship.type_cd", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DocumentRelationshipTypeCdTyp documentRelationshipTypeCd;
    @XmlElement(name = "related_document", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected RelatedDocumentTyp relatedDocument;
    @XmlElement(name = "local_header")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<LocalHeaderContModel> localHeader;

    /**
     * Ruft den Wert der documentRelationshipTypeCd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentRelationshipTypeCdTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DocumentRelationshipTypeCdTyp getDocumentRelationshipTypeCd() {
        return documentRelationshipTypeCd;
    }

    /**
     * Legt den Wert der documentRelationshipTypeCd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRelationshipTypeCdTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDocumentRelationshipTypeCd(DocumentRelationshipTypeCdTyp value) {
        this.documentRelationshipTypeCd = value;
    }

    /**
     * Ruft den Wert der relatedDocument-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RelatedDocumentTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public RelatedDocumentTyp getRelatedDocument() {
        return relatedDocument;
    }

    /**
     * Legt den Wert der relatedDocument-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedDocumentTyp }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRelatedDocument(RelatedDocumentTyp value) {
        this.relatedDocument = value;
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
