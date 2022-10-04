
package org.goafabric.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für person_name_nm_typ complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="person_name_nm_typ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="GIV" type="{urn:ehd/001}pnxp_string_typ"/>
 *         &lt;element name="MID" type="{urn:ehd/001}pnxp_string_typ"/>
 *         &lt;element name="FAM" type="{urn:ehd/001}pnxp_string_typ"/>
 *         &lt;element name="PFX" type="{urn:ehd/001}pnxp_string_typ"/>
 *         &lt;element name="SFX" type="{urn:ehd/001}pnxp_string_typ"/>
 *         &lt;element name="DEL" type="{urn:ehd/001}pnxp_string_typ"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person_name_nm_typ", propOrder = {
    "givOrMIDOrFAM"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PersonNameNmTyp {

    @XmlElementRefs({
        @XmlElementRef(name = "GIV", namespace = "urn:ehd/001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MID", namespace = "urn:ehd/001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PFX", namespace = "urn:ehd/001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FAM", namespace = "urn:ehd/001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SFX", namespace = "urn:ehd/001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DEL", namespace = "urn:ehd/001", type = JAXBElement.class, required = false)
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<JAXBElement<PnxpStringTyp>> givOrMIDOrFAM;

    /**
     * Gets the value of the givOrMIDOrFAM property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givOrMIDOrFAM property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGIVOrMIDOrFAM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PnxpStringTyp }{@code >}
     * {@link JAXBElement }{@code <}{@link PnxpStringTyp }{@code >}
     * {@link JAXBElement }{@code <}{@link PnxpStringTyp }{@code >}
     * {@link JAXBElement }{@code <}{@link PnxpStringTyp }{@code >}
     * {@link JAXBElement }{@code <}{@link PnxpStringTyp }{@code >}
     * {@link JAXBElement }{@code <}{@link PnxpStringTyp }{@code >}
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<JAXBElement<PnxpStringTyp>> getGIVOrMIDOrFAM() {
        if (givOrMIDOrFAM == null) {
            givOrMIDOrFAM = new ArrayList<JAXBElement<PnxpStringTyp>>();
        }
        return this.givOrMIDOrFAM;
    }

}
