package ru.spb.iac.ldap.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import ru.spb.iac.ldap.dao.PersonDAO
import ru.spb.iac.ldapname.*

/**
 * Ldap Web Service. Performs CRU operations.
 * User: normal
 * Date: 21.03.12
 */
class LdapServiceImpl implements NewLdapPort {
    @Autowired
    @Qualifier("individualDAO")
    PersonDAO individualDAO
    @Autowired
    @Qualifier("organizationDAO")
    PersonDAO organizationDAO

    CreateResponseType create(CreateRequestType createRequestPart) {
        return individualDAO.create(createRequestPart)
    }

    EditResponseType editOrg(EditRequestType editRequestPart) {
        return organizationDAO.edit(editRequestPart)
    }

    SearchLoginResponseType searchLogin(SearchLoginRequestType searchLoginRequestPart) {
        return individualDAO.searchLogin(searchLoginRequestPart)
    }

    SearchResponseType search(SearchRequestType searchRequestPart) {
        return individualDAO.search(searchRequestPart)
    }

    SearchResponseType searchOrg(SearchRequestType searchRequestPart) {
        return organizationDAO.search(searchRequestPart)
    }

    EditResponseType edit(EditRequestType editRequestPart) {
        return individualDAO.edit(editRequestPart)
    }

    CreateResponseType createOrg(CreateRequestType createRequestPart) {
        return organizationDAO.create(createRequestPart)
    }
}
