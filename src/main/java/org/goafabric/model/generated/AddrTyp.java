
package org.goafabric.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für addr_typ complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="addr_typ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="STR" type="{urn:ehd/001}v_string_typ"/>
 *         &lt;element name="HNR" type="{urn:ehd/001}v_string_typ"/>
 *         &lt;element name="POB" type="{urn:ehd/001}v_string_typ"/>
 *         &lt;element name="ZIP" type="{urn:ehd/001}v_string_typ"/>
 *         &lt;element name="CTY" type="{urn:ehd/001}v_string_typ"/>
 *         &lt;element name="STA" type="{urn:ehd/001}v_string_typ"/>
 *         &lt;element name="CNT" type="{urn:ehd/001}v_string_typ"/>
 *         &lt;element name="ADL" type="{urn:ehd/001}v_string_typ"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addr_typ", propOrder = {
    "strOrHNROrPOB"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class AddrTyp {

    @XmlElementRefs({
        @XmlElementRef(name = "STR", namespace = "urn:ehd/001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ADL", namespace = "urn:ehd/001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ZIP", namespace = "urn:ehd/001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "STA", namespace = "urn:ehd/001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CNT", namespace = "urn:ehd/001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "POB", namespace = "urn:ehd/001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CTY", namespace = "urn:ehd/001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HNR", namespace = "urn:ehd/001", type = JAXBElement.class, required = false)
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<JAXBElement<VStringTyp>> strOrHNROrPOB;

    /**
     * Gets the value of the strOrHNROrPOB property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strOrHNROrPOB property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTROrHNROrPOB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}
     * {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}
     * {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}
     * {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}
     * {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}
     * {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}
     * {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}
     * {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<JAXBElement<VStringTyp>> getSTROrHNROrPOB() {
        if (strOrHNROrPOB == null) {
            strOrHNROrPOB = new ArrayList<JAXBElement<VStringTyp>>();
        }
        return this.strOrHNROrPOB;
    }

}
