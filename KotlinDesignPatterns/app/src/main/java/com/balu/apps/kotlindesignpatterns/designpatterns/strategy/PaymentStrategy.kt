package com.balu.apps.kotlindesignpatterns.designpatterns.strategy

interface PaymentStrategy {
    fun pay(amount: Double)
}