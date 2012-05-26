
package ru.spb.iac.ldapname;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.spb.iac.ldapname package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EditResponseOrg_QNAME = new QName("http://iac.spb.ru/LDAPname", "editResponseOrg");
    private final static QName _CreateRequest_QNAME = new QName("http://iac.spb.ru/LDAPname", "createRequest");
    private final static QName _SearchResponseOrg_QNAME = new QName("http://iac.spb.ru/LDAPname", "searchResponseOrg");
    private final static QName _SearchLoginResponse_QNAME = new QName("http://iac.spb.ru/LDAPname", "searchLoginResponse");
    private final static QName _CreateResponse_QNAME = new QName("http://iac.spb.ru/LDAPname", "createResponse");
    private final static QName _EditResponse_QNAME = new QName("http://iac.spb.ru/LDAPname", "editResponse");
    private final static QName _SearchLoginRequest_QNAME = new QName("http://iac.spb.ru/LDAPname", "searchLoginRequest");
    private final static QName _EditRequest_QNAME = new QName("http://iac.spb.ru/LDAPname", "editRequest");
    private final static QName _EditRequestOrg_QNAME = new QName("http://iac.spb.ru/LDAPname", "editRequestOrg");
    private final static QName _SearchRequestOrg_QNAME = new QName("http://iac.spb.ru/LDAPname", "searchRequestOrg");
    private final static QName _SearchRequest_QNAME = new QName("http://iac.spb.ru/LDAPname", "searchRequest");
    private final static QName _SearchResponse_QNAME = new QName("http://iac.spb.ru/LDAPname", "searchResponse");
    private final static QName _CreateRequestOrg_QNAME = new QName("http://iac.spb.ru/LDAPname", "createRequestOrg");
    private final static QName _CreateResponseOrg_QNAME = new QName("http://iac.spb.ru/LDAPname", "createResponseOrg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.spb.iac.ldapname
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateResponseType }
     * 
     */
    public CreateResponseType createCreateResponseType() {
        return new CreateResponseType();
    }

    /**
     * Create an instance of {@link CreateRequestType }
     * 
     */
    public CreateRequestType createCreateRequestType() {
        return new CreateRequestType();
    }

    /**
     * Create an instance of {@link SearchResponseType }
     * 
     */
    public SearchResponseType createSearchResponseType() {
        return new SearchResponseType();
    }

    /**
     * Create an instance of {@link SearchLoginResponseType }
     * 
     */
    public SearchLoginResponseType createSearchLoginResponseType() {
        return new SearchLoginResponseType();
    }

    /**
     * Create an instance of {@link EditRequestType }
     * 
     */
    public EditRequestType createEditRequestType() {
        return new EditRequestType();
    }

    /**
     * Create an instance of {@link SearchRequestType }
     * 
     */
    public SearchRequestType createSearchRequestType() {
        return new SearchRequestType();
    }

    /**
     * Create an instance of {@link LdapFio }
     * 
     */
    public LdapFio createLdapFio() {
        return new LdapFio();
    }

    /**
     * Create an instance of {@link SearchLoginRequestType }
     * 
     */
    public SearchLoginRequestType createSearchLoginRequestType() {
        return new SearchLoginRequestType();
    }

    /**
     * Create an instance of {@link EditResponseType }
     * 
     */
    public EditResponseType createEditResponseType() {
        return new EditResponseType();
    }

    /**
     * Create an instance of {@link LdapFioLight }
     * 
     */
    public LdapFioLight createLdapFioLight() {
        return new LdapFioLight();
    }

    /**
     * Create an instance of {@link PersonalInfo }
     * 
     */
    public PersonalInfo createPersonalInfo() {
        return new PersonalInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iac.spb.ru/LDAPname", name = "editResponseOrg")
    public JAXBElement<EditResponseType> createEditResponseOrg(EditResponseType value) {
        return new JAXBElement<EditResponseType>(_EditResponseOrg_QNAME, EditResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iac.spb.ru/LDAPname", name = "createRequest")
    public JAXBElement<CreateRequestType> createCreateRequest(CreateRequestType value) {
        return new JAXBElement<CreateRequestType>(_CreateRequest_QNAME, CreateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iac.spb.ru/LDAPname", name = "searchResponseOrg")
    public JAXBElement<SearchResponseType> createSearchResponseOrg(SearchResponseType value) {
        return new JAXBElement<SearchResponseType>(_SearchResponseOrg_QNAME, SearchResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchLoginResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iac.spb.ru/LDAPname", name = "searchLoginResponse")
    public JAXBElement<SearchLoginResponseType> createSearchLoginResponse(SearchLoginResponseType value) {
        return new JAXBElement<SearchLoginResponseType>(_SearchLoginResponse_QNAME, SearchLoginResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iac.spb.ru/LDAPname", name = "createResponse")
    public JAXBElement<CreateResponseType> createCreateResponse(CreateResponseType value) {
        return new JAXBElement<CreateResponseType>(_CreateResponse_QNAME, CreateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iac.spb.ru/LDAPname", name = "editResponse")
    public JAXBElement<EditResponseType> createEditResponse(EditResponseType value) {
        return new JAXBElement<EditResponseType>(_EditResponse_QNAME, EditResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchLoginRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iac.spb.ru/LDAPname", name = "searchLoginRequest")
    public JAXBElement<SearchLoginRequestType> createSearchLoginRequest(SearchLoginRequestType value) {
        return new JAXBElement<SearchLoginRequestType>(_SearchLoginRequest_QNAME, SearchLoginRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iac.spb.ru/LDAPname", name = "editRequest")
    public JAXBElement<EditRequestType> createEditRequest(EditRequestType value) {
        return new JAXBElement<EditRequestType>(_EditRequest_QNAME, EditRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iac.spb.ru/LDAPname", name = "editRequestOrg")
    public JAXBElement<EditRequestType> createEditRequestOrg(EditRequestType value) {
        return new JAXBElement<EditRequestType>(_EditRequestOrg_QNAME, EditRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iac.spb.ru/LDAPname", name = "searchRequestOrg")
    public JAXBElement<SearchRequestType> createSearchRequestOrg(SearchRequestType value) {
        return new JAXBElement<SearchRequestType>(_SearchRequestOrg_QNAME, SearchRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iac.spb.ru/LDAPname", name = "searchRequest")
    public JAXBElement<SearchRequestType> createSearchRequest(SearchRequestType value) {
        return new JAXBElement<SearchRequestType>(_SearchRequest_QNAME, SearchRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iac.spb.ru/LDAPname", name = "searchResponse")
    public JAXBElement<SearchResponseType> createSearchResponse(SearchResponseType value) {
        return new JAXBElement<SearchResponseType>(_SearchResponse_QNAME, SearchResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iac.spb.ru/LDAPname", name = "createRequestOrg")
    public JAXBElement<CreateRequestType> createCreateRequestOrg(CreateRequestType value) {
        return new JAXBElement<CreateRequestType>(_CreateRequestOrg_QNAME, CreateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iac.spb.ru/LDAPname", name = "createResponseOrg")
    public JAXBElement<CreateResponseType> createCreateResponseOrg(CreateResponseType value) {
        return new JAXBElement<CreateResponseType>(_CreateResponseOrg_QNAME, CreateResponseType.class, null, value);
    }

}
