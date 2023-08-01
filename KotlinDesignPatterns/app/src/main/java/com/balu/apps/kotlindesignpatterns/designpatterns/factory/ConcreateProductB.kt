package com.balu.apps.kotlindesignpatterns.designpatterns.factory

class ConcreateProductB: Product {
    override fun create() = println("Product B created...!")
}