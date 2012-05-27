package ru.spb.iac.ldap.dao

import javax.naming.NamingException
import javax.naming.directory.Attributes
import org.springframework.ldap.core.AttributesMapper
import org.springframework.ldap.core.LdapTemplate
import ru.spb.iac.ldapname.SearchLoginResponseType
import org.springframework.beans.factory.annotation.Autowired

/**
 * User: normal
 * Date: 21.03.12
 */
abstract class AbstractPersonDaoImpl implements PersonDAO {
    @Autowired
    LdapTemplate ldapTemplate

    ru.spb.iac.ldapname.SearchLoginResponseType searchLogin(ru.spb.iac.ldapname.SearchLoginRequestType searchLoginRequestPart) {
        def result = false
        def loginList = ldapTemplate.search(
                "", "(&(objectclass=inetOrgPerson)(uid=*_" + searchLoginRequestPart?.login + "))",
                new AttributesMapper() {
                    public Object mapFromAttributes(Attributes attrs)
                    throws NamingException {
                        return attrs.get("login").get();
                    }
                }
        );
        if (loginList.size() == 0)
            result = true

        return new SearchLoginResponseType(
                loginAvailable: result
        )
    }
}