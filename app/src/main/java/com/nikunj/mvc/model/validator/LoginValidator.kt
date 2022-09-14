package com.nikunj.mvc.model.validator

import com.nikunj.mvc.model.domain.Credential


class LoginValidator : Validator {

    private val userCredential = Credential("nikunj", "123456")

    override fun validate(credential: Credential): Boolean {
        return credential == userCredential
    }

}