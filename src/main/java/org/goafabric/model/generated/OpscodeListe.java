
package org.goafabric.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ehd/sdops/001}opscode" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "opscode"
})
@XmlRootElement(name = "opscode_liste", namespace = "urn:ehd/sdops/001")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class OpscodeListe {

    @XmlElement(namespace = "urn:ehd/sdops/001", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Opscode> opscode;

    /**
     * Gets the value of the opscode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opscode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpscode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Opscode }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Opscode> getOpscode() {
        if (opscode == null) {
            opscode = new ArrayList<Opscode>();
        }
        return this.opscode;
    }

}
