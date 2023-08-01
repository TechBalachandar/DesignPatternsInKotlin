package com.balu.apps.kotlindesignpatterns.designpatterns.adapter

interface NewPaymentProcessor {
    fun pay(amount: Double): String
}