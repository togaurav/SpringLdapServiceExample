package ru.spb.iac.ldap.dao.mapper

import org.springframework.stereotype.Component
import javax.naming.directory.Attribute
import javax.naming.directory.BasicAttribute

/**
 * User: normal
 * Date: 21.03.12
 */
@Component("mapUtils")
class MapUtils {

    public String getUTIKFromUid(String uid){
        String[] uidParts = (uid.toString()).split("_")
        return uidParts[0];
    }

    public String getLoginFromUid(String uid){
        String[] uidParts = (uid.toString()).split("_")
        return uidParts[1];
    }

    public Attribute setBasicAttribute() {
        Attribute objectClasses = new BasicAttribute("objectClass")
        objectClasses.add("inetOrgPerson")
        objectClasses.add("person")
        objectClasses.add("organizationalPerson")
        objectClasses.add("top")
        objectClasses.add("personUser")

        return objectClasses;
    }
}