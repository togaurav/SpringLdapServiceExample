package ru.spb.iac.ldapname;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-04-06T17:05:27.444+04:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://iac.spb.ru/LDAPname", name = "NewLdapPort")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface NewLdapPort {

    @WebResult(name = "createResponse", targetNamespace = "http://iac.spb.ru/LDAPname", partName = "createResponsePart")
    @WebMethod(action = "create")
    public CreateResponseType create(
        @WebParam(partName = "createRequestPart", name = "createRequest", targetNamespace = "http://iac.spb.ru/LDAPname")
        CreateRequestType createRequestPart
    );

    @WebResult(name = "editResponseOrg", targetNamespace = "http://iac.spb.ru/LDAPname", partName = "editResponsePart")
    @WebMethod(action = "editOrg")
    public EditResponseType editOrg(
        @WebParam(partName = "editRequestPart", name = "editRequestOrg", targetNamespace = "http://iac.spb.ru/LDAPname")
        EditRequestType editRequestPart
    );

    @WebResult(name = "searchLoginResponse", targetNamespace = "http://iac.spb.ru/LDAPname", partName = "searchLoginResponsePart")
    @WebMethod(action = "searchLogin")
    public SearchLoginResponseType searchLogin(
        @WebParam(partName = "searchLoginRequestPart", name = "searchLoginRequest", targetNamespace = "http://iac.spb.ru/LDAPname")
        SearchLoginRequestType searchLoginRequestPart
    );

    @WebResult(name = "searchResponse", targetNamespace = "http://iac.spb.ru/LDAPname", partName = "searchResponsePart")
    @WebMethod(action = "search")
    public SearchResponseType search(
        @WebParam(partName = "searchRequestPart", name = "searchRequest", targetNamespace = "http://iac.spb.ru/LDAPname")
        SearchRequestType searchRequestPart
    );

    @WebResult(name = "searchResponseOrg", targetNamespace = "http://iac.spb.ru/LDAPname", partName = "searchResponsePart")
    @WebMethod(action = "searchOrg")
    public SearchResponseType searchOrg(
        @WebParam(partName = "searchRequestPart", name = "searchRequestOrg", targetNamespace = "http://iac.spb.ru/LDAPname")
        SearchRequestType searchRequestPart
    );

    @WebResult(name = "editResponse", targetNamespace = "http://iac.spb.ru/LDAPname", partName = "editResponsePart")
    @WebMethod(action = "edit")
    public EditResponseType edit(
        @WebParam(partName = "editRequestPart", name = "editRequest", targetNamespace = "http://iac.spb.ru/LDAPname")
        EditRequestType editRequestPart
    );

    @WebResult(name = "createResponseOrg", targetNamespace = "http://iac.spb.ru/LDAPname", partName = "createResponsePart")
    @WebMethod(action = "createOrg")
    public CreateResponseType createOrg(
        @WebParam(partName = "createRequestPart", name = "createRequestOrg", targetNamespace = "http://iac.spb.ru/LDAPname")
        CreateRequestType createRequestPart
    );
}
