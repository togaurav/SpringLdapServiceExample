package ru.spb.iac.ldap.dao.mapper

import org.junit.Test
import junit.framework.TestCase

/**
 * User: normal
 * Date: 21.03.12
 */
class MapUtilsTest {

    @Test
    public void testUtils(){
        def mapUtils = new MapUtils()
        def example = "utik_login"

        TestCase.assertEquals mapUtils.getLoginFromUid(example), "login"
        TestCase.assertEquals mapUtils.getUTIKFromUid(example), "utik"
    }
}
