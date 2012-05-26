
package ru.spb.iac.ldapname;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="utik" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://iac.spb.ru/LDAPname}ldapFio"/>
 *         &lt;element name="nameRod" type="{http://iac.spb.ru/LDAPname}ldapFioLight" minOccurs="0"/>
 *         &lt;element name="accept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newAccountTabu" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createRequestType", propOrder = {
    "utik",
    "email",
    "phone",
    "password",
    "login",
    "name",
    "nameRod",
    "accept",
    "newAccountTabu"
})
public class CreateRequestType {

    @XmlElement(required = true)
    protected String utik;
    protected String email;
    protected String phone;
    @XmlElement(required = true)
    protected String password;
    protected String login;
    @XmlElement(required = true)
    protected LdapFio name;
    protected LdapFioLight nameRod;
    protected String accept;
    protected boolean newAccountTabu;

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

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link LdapFio }
     *     
     */
    public LdapFio getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapFio }
     *     
     */
    public void setName(LdapFio value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameRod property.
     * 
     * @return
     *     possible object is
     *     {@link LdapFioLight }
     *     
     */
    public LdapFioLight getNameRod() {
        return nameRod;
    }

    /**
     * Sets the value of the nameRod property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapFioLight }
     *     
     */
    public void setNameRod(LdapFioLight value) {
        this.nameRod = value;
    }

    /**
     * Gets the value of the accept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccept() {
        return accept;
    }

    /**
     * Sets the value of the accept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccept(String value) {
        this.accept = value;
    }

    /**
     * Gets the value of the newAccountTabu property.
     * 
     */
    public boolean isNewAccountTabu() {
        return newAccountTabu;
    }

    /**
     * Sets the value of the newAccountTabu property.
     * 
     */
    public void setNewAccountTabu(boolean value) {
        this.newAccountTabu = value;
    }

}
