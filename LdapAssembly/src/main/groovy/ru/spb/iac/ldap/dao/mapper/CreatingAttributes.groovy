package ru.spb.iac.ldap.dao.mapper

import javax.naming.directory.BasicAttributes
import javax.naming.directory.Attribute

/**
 * User: normal
 * Date: 27.03.12
 */
class CreatingAttributes extends BasicAttributes {
    public Attribute put(String attrID, Object val) {
        if (val) super.put(attrID, val)
    }
}
