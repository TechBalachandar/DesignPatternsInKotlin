package com.balu.apps.kotlindesignpatterns.designpatterns.strategy

class CreditCardPayment: PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $amount using Credit Card.")
    }
}