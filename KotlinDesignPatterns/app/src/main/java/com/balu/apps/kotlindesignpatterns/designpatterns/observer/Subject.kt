package com.balu.apps.kotlindesignpatterns.designpatterns.observer

class Subject {
    private val observers = mutableListOf<Observer>()

    fun addObserver(observer: Observer) = observers.add(observer)
    fun removeObserver(observer: Observer) = observers.remove(observer)

    fun notifyObserver(message: String){
        for (observer in observers){
            observer.update(message)
        }
    }
}