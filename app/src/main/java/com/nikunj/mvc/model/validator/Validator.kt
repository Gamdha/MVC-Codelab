package com.nikunj.mvc.model.validator

import com.nikunj.mvc.model.domain.Credential

interface Validator {

    fun validate(credential: Credential): Boolean

}
