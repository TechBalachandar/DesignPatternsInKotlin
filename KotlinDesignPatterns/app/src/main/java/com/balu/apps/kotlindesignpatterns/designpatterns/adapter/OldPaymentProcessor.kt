package com.balu.apps.kotlindesignpatterns.designpatterns.adapter

class OldPaymentProcessor {
    fun makePayment(price: Int): String{
        return "Payment made: $price"
    }
}