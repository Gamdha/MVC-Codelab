package com.nikunj.mvc.model

import com.nikunj.mvc.model.validator.LoginValidator


object ModelModule {

    val dataAccessLayer : DataAccessLayer by lazy { dataAccessLayer() }

    private fun dataAccessLayer() = DataAccessLayer(LoginValidator(), AccountRepository())
}