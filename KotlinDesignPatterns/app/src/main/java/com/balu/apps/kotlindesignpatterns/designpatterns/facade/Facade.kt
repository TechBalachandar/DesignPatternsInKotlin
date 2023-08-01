package com.balu.apps.kotlindesignpatterns.designpatterns.facade

class Facade(
    private val subsystemA: SubsystemA,
    private val subsystemB: SubsystemB
) {
    fun doSomething(){
        subsystemA.operationA()
        subsystemB.operationB()
    }
}