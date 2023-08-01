package com.balu.apps.kotlindesignpatterns.designpatterns.strategy

class ShoppingCart(private val paymentStrategy: PaymentStrategy) {
    fun checkout(amount: Double){
        paymentStrategy.pay(amount)
    }
}