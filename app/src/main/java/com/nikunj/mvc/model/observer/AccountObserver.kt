package com.nikunj.mvc.model.observer


interface AccountObserver : DomainObserver {

    fun accountLoggedIn()

    fun accountUnknown()
}