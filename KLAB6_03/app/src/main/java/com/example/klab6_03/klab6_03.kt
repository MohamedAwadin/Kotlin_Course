package com.example.klab6_03

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun doHeavyFactorial(times : Int = 5 ) : Int{
    var counter = 1
    repeat(times) {
        delay( 100* times.toLong())
        counter *= (it+1)
    }
    return counter
}


fun main() = runBlocking {
    val  a = async {
        doHeavyFactorial(5)
    }
    println(a.await())
}