package ru.spb.iac.ldap.dao

/**
 * User: normal
 * Date: 21.03.12
 */
public interface PersonDAO {
    ru.spb.iac.ldapname.CreateResponseType create(ru.spb.iac.ldapname.CreateRequestType createRequestPart)
    ru.spb.iac.ldapname.EditResponseType edit(ru.spb.iac.ldapname.EditRequestType editRequestPart)
    ru.spb.iac.ldapname.SearchLoginResponseType searchLogin(ru.spb.iac.ldapname.SearchLoginRequestType searchLoginRequestPart)
    ru.spb.iac.ldapname.SearchResponseType search(ru.spb.iac.ldapname.SearchRequestType searchRequestPart)
}