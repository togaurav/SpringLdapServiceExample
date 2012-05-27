package ru.spb.iac.ldap.dao

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import ru.spb.iac.ldap.dao.mapper.AddUserMapper
import ru.spb.iac.ldapname.*

/**
 * User: normal
 * Date: 27.03.12
 */
@Component("organizationDAO")
class OrganizationDAOImpl extends AbstractPersonDaoImpl{
    @Autowired
    @Qualifier("individualDAO")
    PersonDAO individualDAO
    @Autowired
    AddUserMapper addUserMapper

    CreateResponseType create(CreateRequestType createRequestPart) {
        def creatingUser = individualDAO.create(createRequestPart)
        if(creatingUser.result)
            ldapTemplate.modifyAttributes(addUserMapper.buildDn("jur"), addUserMapper.addUser(createRequestPart))
        return creatingUser
    }

    EditResponseType edit(EditRequestType editRequestPart) {
        return individualDAO.edit(editRequestPart)
    }

    SearchResponseType search(SearchRequestType searchRequestPart) {
        return individualDAO.search(searchRequestPart)
    }
}
