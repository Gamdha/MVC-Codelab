package com.nikunj.mvc.controller

import com.nikunj.mvc.model.ModelModule


object ControllerModule {

    fun loginController() = LoginController(ModelModule.dataAccessLayer)
}