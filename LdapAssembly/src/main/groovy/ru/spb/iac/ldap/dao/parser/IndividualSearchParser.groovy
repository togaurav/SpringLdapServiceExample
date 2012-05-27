package ru.spb.iac.ldap.dao.parser

import org.springframework.stereotype.Component
import ru.spb.iac.ldapname.SearchResponseType
import ru.spb.iac.ldapname.PersonalInfo

/**
 * User: normal
 * Date: 22.03.12
 */
@Component("personSearchParser")
class IndividualSearchParser {
    SearchResponseType parse(List<PersonalInfo> infoList) {
        def response = new SearchResponseType()
        if (infoList.size() == 1) {
            if (infoList.get(0).newAccountTabu)
                response = new SearchResponseType(
                        person: infoList.get(0),
                        errorCode: 3,
                        errorString: "Success search one login with TABU.",
                        result: true
                )
            else response = new SearchResponseType(
                    person: infoList.get(0),
                    errorCode: 4,
                    errorString: "Success search one login.",
                    result: true
            )
        } else if (infoList.size() == 0){
            response = new SearchResponseType(
                    errorCode: 0,
                    errorString: "No one were found.",
                    result: false
            )
        }
        else {
            for (PersonalInfo person: infoList) {
                if (!person?.login) {
                    //No login means accessing card
                    response = new SearchResponseType(
                            person: person,
                            errorCode: 2,
                            errorString: "Success search an access cart account.",
                            result: true
                    )
                    break
                }
                if (person?.newAccountTabu) {
                    response = new SearchResponseType(
                            person: person,
                            errorCode: 3,
                            errorString: "Success search one login with TABU.",
                            result: true
                    )
                    break
                }
            }
            if(!response?.errorCode) response = new SearchResponseType(
                    errorCode: 5,
                    errorString: "Success search. " + infoList?.size() + " logins were found.",
                    result: true
            )
        }

        return response
    }
}
