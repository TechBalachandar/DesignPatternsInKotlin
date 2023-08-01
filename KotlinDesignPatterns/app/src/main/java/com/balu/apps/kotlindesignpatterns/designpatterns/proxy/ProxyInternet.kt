package com.balu.apps.kotlindesignpatterns.designpatterns.proxy

class ProxyInternet(private val realInternet: RealInternet): Internet {
    override fun connectTo(serverHost: String) {
        if(serverHost == "example.com"){
            println("Access denied. Cannot connect to $serverHost")
        } else {
            realInternet.connectTo(serverHost)
        }
    }
}