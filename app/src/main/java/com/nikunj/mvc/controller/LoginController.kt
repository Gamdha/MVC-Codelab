package com.nikunj.mvc.controller

import com.nikunj.mvc.model.DataAccessLayer
import com.nikunj.mvc.view.LoginView


class LoginController(private val model: DataAccessLayer) {

    private lateinit var view: LoginView

    fun bind(loginView: LoginView) {
        view = loginView
    }

    fun onLoginButtonClicked() {
        model.performLogin(view.getUsername(), view.getPassword())
    }

}