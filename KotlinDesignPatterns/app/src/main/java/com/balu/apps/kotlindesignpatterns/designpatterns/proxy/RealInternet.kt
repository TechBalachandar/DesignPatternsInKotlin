package com.balu.apps.kotlindesignpatterns.designpatterns.proxy

class RealInternet: Internet {
    override fun connectTo(serverHost: String) {
        println("Connected to $serverHost")
    }
}