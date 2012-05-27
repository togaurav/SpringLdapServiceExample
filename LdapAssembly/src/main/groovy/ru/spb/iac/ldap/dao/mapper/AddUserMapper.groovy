package ru.spb.iac.ldap.dao.mapper

import javax.naming.Name
import javax.naming.directory.Attribute
import javax.naming.directory.BasicAttribute
import javax.naming.directory.ModificationItem
import org.springframework.ldap.core.DirContextOperations
import org.springframework.ldap.core.DistinguishedName
import org.springframework.stereotype.Component
import ru.spb.iac.ldapname.CreateRequestType

/**
 * User: normal
 * Date: 26.03.12
 */
@Component("addUserMapper")
class AddUserMapper {
    Name buildDn(String groupLabel) {
        def dn = new DistinguishedName()
        dn.add("cn", "groups")
        dn.add("cn", groupLabel)
        return dn
    }

    ModificationItem addUser(CreateRequestType request) {
        def url = ""
        if (request?.login)
          url = "uid=" + request?.utik  +"_"+request?.login + ",cn=users,dc=iac,dc=spb,dc=ru"
        else
            url = "uid="+request?.utik+",cn=users,dc=iac,dc=spb,dc=ru"
        Attribute uniqueAttribute = new BasicAttribute("uniqueMember", url)
        return new ModificationItem(DirContextOperations.ADD_ATTRIBUTE, uniqueAttribute)
    }
}
