package ru.spb.iac.ldap.dao

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import ru.spb.iac.ldap.dao.mapper.AddUserMapper
import ru.spb.iac.ldap.dao.mapper.individual.IndividualCreateMapper
import ru.spb.iac.ldap.dao.mapper.individual.IndividualEditMapper
import ru.spb.iac.ldap.dao.mapper.individual.IndividualSearchMapper
import ru.spb.iac.ldap.dao.parser.IndividualSearchParser
import ru.spb.iac.ldapname.*

/**
 * PersonDAOImpl performs LDAP activities for editing, searching and creating individuals.
 * Used SpringLdapTemplate. Looking applicationContext.xml and SpringLdap reference for details.
 * User: normal
 * Date: 21.03.12
 */
@Component("individualDAO")
class IndividualDAOImpl extends AbstractPersonDaoImpl {
    @Autowired
    IndividualSearchMapper personSearchMapper
    @Autowired
    IndividualSearchParser personSearchParser
    @Autowired
    IndividualCreateMapper personCreateMapper
    @Autowired
    IndividualEditMapper personEditMapper
    @Autowired
    AddUserMapper addUserMapper

    /**
     * Individual creation is consists of two steps. First of all, we bind entity into cn=users. After that modifying [cn=groups cn=users], That is need WebSphere portal for authorization.
     * @param createRequestPart
     * @return
     */
    CreateResponseType create(CreateRequestType createRequestPart) {
            ldapTemplate.bind(personCreateMapper.buildDn(createRequestPart), null, personCreateMapper.buildAttributes(createRequestPart))
            ldapTemplate.modifyAttributes(addUserMapper.buildDn("users"), addUserMapper.addUser(createRequestPart))
            return new CreateResponseType(
                    result: true,
                    errorCode: "0",
                    errorString: "Successfully created"
            )
    }

    /**
     * Edit individual account. Cant edit login and UTIK.
     * @param editRequestPart
     * @return
     */
    EditResponseType edit(EditRequestType editRequestPart) {
        ldapTemplate.modifyAttributes(personEditMapper.buildDn(editRequestPart), personEditMapper.setModItems(editRequestPart))
        return new EditResponseType(
                errorCode: "Successfully edited",
                errorString: "0",
                wasEdited: true
        )
    }

    /**
     * Search individual account by pattern here. It is {uid=utik} or {uid=utik_something}
     * @param searchRequestPart
     * @return
     */
    SearchResponseType search(SearchRequestType searchRequestPart) {
        def utik = searchRequestPart?.utik
        List<PersonalInfo> persons = ldapTemplate.search(
                "", "(|(uid=${utik})(uid=${utik}_*))",
                personSearchMapper
        )
        return personSearchParser.parse(persons)
    }
}
