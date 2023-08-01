package com.balu.apps.kotlindesignpatterns

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.balu.apps.kotlindesignpatterns.designpatterns.adapter.Adapter
import com.balu.apps.kotlindesignpatterns.designpatterns.adapter.NewPaymentProcessor
import com.balu.apps.kotlindesignpatterns.designpatterns.adapter.OldPaymentProcessor
import com.balu.apps.kotlindesignpatterns.designpatterns.decorator.Garlands
import com.balu.apps.kotlindesignpatterns.designpatterns.decorator.PineChristmasTree
import com.balu.apps.kotlindesignpatterns.designpatterns.facade.Facade
import com.balu.apps.kotlindesignpatterns.designpatterns.facade.SubsystemA
import com.balu.apps.kotlindesignpatterns.designpatterns.facade.SubsystemB
import com.balu.apps.kotlindesignpatterns.designpatterns.factory.ProductFactory
import com.balu.apps.kotlindesignpatterns.designpatterns.observer.ConcreteObserver
import com.balu.apps.kotlindesignpatterns.designpatterns.observer.Subject
import com.balu.apps.kotlindesignpatterns.designpatterns.prototype.invokePrototype
import com.balu.apps.kotlindesignpatterns.designpatterns.proxy.ProxyInternet
import com.balu.apps.kotlindesignpatterns.designpatterns.proxy.RealInternet
import com.balu.apps.kotlindesignpatterns.designpatterns.strategy.CreditCardPayment
import com.balu.apps.kotlindesignpatterns.designpatterns.strategy.PayPalPayment
import com.balu.apps.kotlindesignpatterns.designpatterns.strategy.ShoppingCart
import com.balu.apps.kotlindesignpatterns.ui.theme.KotlinDesignPatternsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinDesignPatternsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

fun runDecorator(): String {
    val christmasTree = Garlands(PineChristmasTree())
    return christmasTree.decorate()
}
fun invokeFactoryMethod(){
    val factory = ProductFactory()
    val productA = factory.createProduct("A")
    productA.create()
    val productB = factory.createProduct("B")
    productB.create()
}
fun invokeAdapterPattern(): String{
    val  newPaymentProcessor: NewPaymentProcessor = Adapter(OldPaymentProcessor())
    return newPaymentProcessor.pay(49.99)
}

fun invokeObserverPattern(output: String){
    val subject = Subject()
    ConcreteObserver("Observer 1").apply { subject.addObserver(this) }
    ConcreteObserver("Observer 2").apply { subject.addObserver(this) }

    subject.notifyObserver(output)
}

fun invokeFacade(){
    val subsystemA = SubsystemA()
    val subsystemB = SubsystemB()
    val facade = Facade(subsystemA, subsystemB)
    facade.doSomething()
}

fun invokeProxy(){
    val realInternet = RealInternet()
    val proxyInternet = ProxyInternet(realInternet)

    proxyInternet.connectTo("example.com")
    proxyInternet.connectTo("google.com")
}
fun invokeStrategy(){
    val cart = ShoppingCart(CreditCardPayment())
    cart.checkout(100.0)

    val anotherCart = ShoppingCart(PayPalPayment())
    anotherCart.checkout((50.0))
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var output = invokeFactoryMethod()
    invokeObserverPattern(invokeAdapterPattern())
    Text(
        text = "Hello $output}!",
        modifier = modifier
    )
    invokeFacade()
    invokeProxy()
    invokeStrategy()
    invokePrototype()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinDesignPatternsTheme {
        Greeting("Android")
    }
}