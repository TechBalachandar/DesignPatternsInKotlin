package com.balu.apps.kotlindesignpatterns.designpatterns.adapter

class Adapter(
    private val oldPaymentProcessor: OldPaymentProcessor
    ): NewPaymentProcessor {
    override fun pay(amount: Double):String {
        return oldPaymentProcessor.makePayment(amount.toInt())
    }
}