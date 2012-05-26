
package ru.spb.iac.ldapname;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="utik" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRequestType", propOrder = {
    "utik"
})
public class SearchRequestType {

    @XmlElement(required = true)
    protected String utik;

    /**
     * Gets the value of the utik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtik() {
        return utik;
    }

    /**
     * Sets the value of the utik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtik(String value) {
        this.utik = value;
    }

}
