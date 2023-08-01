package com.balu.apps.kotlindesignpatterns.designpatterns.prototype

fun invokePrototype(){
    val originalProduct = PrototypeProduct("Original Product")

    //Cloning the original product
    val clonedProduct = originalProduct.copy()

    println(originalProduct)
    println(clonedProduct)
}