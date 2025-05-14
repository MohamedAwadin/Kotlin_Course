package com.example.klec2

class FactorySingleton(){
    companion object{
        fun getInstance(myVal: Int): FactorySingleton{
            return FactorySingleton()
        }
    }
}


//class CFG{
//
//}

object CFG{
    init {
        println("Singleton class invoked.")
    }

    var name = "GFG Is Best"
    fun add(num1:Int,num2:Int):Int
    {
        return num1.plus(num2)
    }

}

interface Inteface1{
    fun method(){
        println("interface1")
    }
}

interface Inteface2{
//    fun method(){
//        println("interface2")
//    }

    fun method()
}
class Myclass : Inteface1, Inteface2{
    override fun method() {
        TODO("Not yet implemented")
    }

}

interface NumberSeries{
    var start : Int
    var current : Int
    fun reset()
    fun set()
}

fun mayThrowException(){
    throw Exception()
}


fun main(){
    //val myObj = FactorySingleton.getInstance(5)

//    val obj1 = CFG()
//    val obj2 = CFG()

//    println(CFG.toString())
//    println(CFG.toString())
//
//    println(CFG.name)
//    println("The answer of addition is ${CFG.add(3,2)}")
//    println("The answer of addition is ${CFG.add(10,15)}")

    runCatching(
        mayThrowException()
    ).onFailure { println("fail") }
        .onSuccess { println("success") }

}