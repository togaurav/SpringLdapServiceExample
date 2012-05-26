
package ru.spb.iac.ldapname;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchLoginResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchLoginResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchLoginResponseType", propOrder = {
    "loginAvailable"
})
public class SearchLoginResponseType {

    @XmlElement(defaultValue = "false")
    protected boolean loginAvailable;

    /**
     * Gets the value of the loginAvailable property.
     * 
     */
    public boolean isLoginAvailable() {
        return loginAvailable;
    }

    /**
     * Sets the value of the loginAvailable property.
     * 
     */
    public void setLoginAvailable(boolean value) {
        this.loginAvailable = value;
    }

}
