package ru.spb.iac.ldap.dao.mapper.individual

import javax.naming.Name
import javax.naming.directory.ModificationItem
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ldap.core.DistinguishedName
import org.springframework.stereotype.Component
import ru.spb.iac.ldapname.EditRequestType
import javax.naming.directory.Attribute
import javax.naming.directory.BasicAttribute
import javax.naming.directory.DirContext
import ru.spb.iac.ldap.dao.mapper.MapUtils

/**
 * User: normal
 * Date: 26.03.12
 */
@Component("personEditMapper")
class IndividualEditMapper {
    @Autowired
    MapUtils utils

    Name buildDn(EditRequestType request) {
        def dn = new DistinguishedName()
        def url = ""
        if(request?.login)
            url = "${request?.utik}_${request?.login}"
        else
            url = request?.utik
        dn.add("cn", "users")
        dn.add("uid", url)
        return dn
    }

    ModificationItem[] setModItems(EditRequestType request) {
        def items = new ArrayList<ModificationItem>()
        if (request?.phone)
            items.add(setModItem("mobile", request?.phone))
        if (request?.accept)
            items.add(setModItem("acceptDo", request?.accept))
        if (request?.email)
            items.add(setModItem("mail", request?.email))
        if (request?.name) {
            if (request?.name?.lastName) items.add(setModItem("sn", request?.name?.lastName))
            if (request?.name?.firstName) items.add(setModItem("cn", request?.name?.firstName))
            if (request?.name?.middleName) items.add(setModItem("givenName", request?.name?.middleName))
        }
        if (request?.nameRod) {
            if (request?.nameRod?.lastName) items.add(setModItem("surNameRod", request?.nameRod?.lastName))
            if (request?.nameRod?.firstName) items.add(setModItem("commonNameRod", request?.nameRod?.firstName))
            if (request?.nameRod?.middleName) items.add(setModItem("givenNameRod", request?.nameRod?.middleName))
        }
        if (request?.password)
            items.add(setModItem("userPassword", request?.password))
        return (ModificationItem[]) items.toArray()
    }

    ModificationItem setModItem(String label, Object value) {
        Attribute attr = new BasicAttribute(label, value)
        return new ModificationItem(DirContext.REPLACE_ATTRIBUTE, attr)
    }
}