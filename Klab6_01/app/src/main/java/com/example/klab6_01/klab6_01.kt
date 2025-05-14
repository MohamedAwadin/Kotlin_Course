package com.example.klab6_01

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val deferred = async {
            for (i in 1..10){
                println(i)
                delay(200)
            }
            "Task Completed"
        }
        val result = deferred.await()
        println("Result: $result")
    }


}
