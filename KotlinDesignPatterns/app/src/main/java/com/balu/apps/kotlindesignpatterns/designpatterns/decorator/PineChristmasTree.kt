package com.balu.apps.kotlindesignpatterns.designpatterns.decorator

class PineChristmasTree: ChristmasTree {
    override fun decorate(): String {
        return "Decorating a Pine Tree...!"
    }
}