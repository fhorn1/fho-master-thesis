
package org.goafabric.model.generated;

import javax.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für sdops_header_typ complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="sdops_header_typ">
 *   &lt;complexContent>
 *     &lt;restriction base="{urn:ehd/001}ehd_header_typ">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:ehd/001}id_typ"/>
 *         &lt;element ref="{urn:ehd/001}document_type_cd"/>
 *         &lt;element name="service_tmr" type="{urn:ehd/001}service_tmr_typ"/>
 *         &lt;element name="origination_dttm" type="{urn:ehd/001}origination_dttm_typ"/>
 *         &lt;element ref="{urn:ehd/001}provider" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:ehd/001}interface"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sdops_header_typ")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-04-17T11:28:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class SdopsHeaderTyp
    extends EhdHeaderTyp
{


}
