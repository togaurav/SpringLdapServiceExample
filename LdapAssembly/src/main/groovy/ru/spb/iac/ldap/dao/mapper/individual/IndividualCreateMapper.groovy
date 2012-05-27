package ru.spb.iac.ldap.dao.mapper.individual

import javax.naming.Name
import javax.naming.directory.Attribute
import javax.naming.directory.Attributes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ldap.core.DistinguishedName
import org.springframework.stereotype.Component
import ru.spb.iac.ldapname.CreateRequestType
import ru.spb.iac.ldap.dao.mapper.MapUtils
import ru.spb.iac.ldap.dao.mapper.CreatingAttributes

/**
 * User: normal
 * Date: 26.03.12
 */
@Component("personCreateMapper")
class IndividualCreateMapper {
    @Autowired
    MapUtils utils

    Attributes buildAttributes(CreateRequestType createRequestPart) {
        Attributes attributes = setAttributesForCreating(createRequestPart)
        Attribute objectClasses = utils.setBasicAttribute()
        attributes.put(objectClasses)
        return attributes
    }

    private Attributes setAttributesForCreating(CreateRequestType request) {
        Attributes attributes = new CreatingAttributes()
        attributes.put("sn", request?.name?.lastName)
        attributes.put("cn", request?.name?.firstName)
        attributes.put("givenName", request?.name?.middleName)
        attributes.put("userPassword", request?.password)
        attributes.put("canDo", request?.newAccountTabu?.toString())
        attributes.put("mail", request?.email)
        attributes.put("mobile", request?.phone)
        attributes.put("acceptDo", request?.accept)
        attributes.put("surNameRod", request?.nameRod?.lastName)
        attributes.put("commonNameRod", request?.nameRod?.firstName)
        attributes.put("givenNameRod", request?.nameRod?.middleName)
        attributes.put("login", request?.login)
        return attributes
    }

    Name buildDn(CreateRequestType request) {
        DistinguishedName dn = new DistinguishedName()
        dn.add("cn", "users")
        if (request?.login)
            dn.add("uid", request?.utik + "_" + request?.login)
        else
            dn.add("uid", "${request?.utik}")
        return dn
    }

}
