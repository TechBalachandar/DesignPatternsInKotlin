package com.balu.apps.kotlindesignpatterns.designpatterns.factory

class ProductFactory {
    fun createProduct(type: String): Product =
        when(type){
            "A" -> ConcreteProductA()
            "B" -> ConcreateProductB()
            else -> throw IllegalArgumentException("Invalid product type.")
        }
}