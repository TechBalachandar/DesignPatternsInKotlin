package com.balu.apps.kotlindesignpatterns.designpatterns.strategy

class PayPalPayment: PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $amount using PayPal.")
    }
}