package com.balu.apps.kotlindesignpatterns.designpatterns.factory

class ConcreteProductA: Product {
    override fun create() = println("Product A created..!")
}