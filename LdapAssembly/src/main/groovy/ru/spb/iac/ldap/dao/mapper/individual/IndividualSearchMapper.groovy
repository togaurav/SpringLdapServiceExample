package ru.spb.iac.ldap.dao.mapper.individual

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ldap.core.AttributesMapper
import ru.spb.iac.ldapname.LdapFio
import ru.spb.iac.ldapname.PersonalInfo
import org.springframework.stereotype.Component
import ru.spb.iac.ldap.dao.mapper.MapUtils
import ru.spb.iac.ldapname.LdapFioLight

/**
 * User: normal
 * Date: 21.03.12
 */
@Component("personSearchMapper")
class IndividualSearchMapper implements AttributesMapper {
    @Autowired
    MapUtils utils

    Object mapFromAttributes(javax.naming.directory.Attributes attributes) {
        return new PersonalInfo(
                utik: utils.getUTIKFromUid((String) attributes?.get("uid")?.get()),
                accept: attributes?.get("acceptDo")?.get(),
                email: attributes?.get("mail")?.get(),
                login: attributes?.get("login")?.get(),
                name: new LdapFio(
                        firstName: attributes?.get("cn")?.get(),
                        lastName: attributes?.get("sn")?.get(),
                        middleName: attributes?.get("givenName")?.get()
                ),
                nameRod: new LdapFioLight(
                        firstName: attributes?.get("commonNameRod")?.get(),
                        lastName: attributes?.get("surNameRod")?.get(),
                        middleName: attributes?.get("givenNameRod")?.get()
                ),
                newAccountTabu: attributes?.get("canDo")?.get()?.toBoolean(),
                password: attributes?.get("userPassword")?.get(),
                phone: attributes?.get("mobile")?.get()
        )
    }
}
