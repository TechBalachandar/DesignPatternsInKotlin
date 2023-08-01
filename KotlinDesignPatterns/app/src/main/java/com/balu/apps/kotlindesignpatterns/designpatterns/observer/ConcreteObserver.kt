package com.balu.apps.kotlindesignpatterns.designpatterns.observer

class ConcreteObserver(private val name: String): Observer {
    override fun update(message: String) {
        println("$name received: $message")
    }
}