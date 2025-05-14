package com.example.klab6_04

import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

suspend fun task1(): String {
    repeat(20) {
        println("Task1 : $it")
        delay(1000)
    }
    return "Task 1 Done"
}

suspend fun task2(): String {
    repeat(20) {
        println("Task2 : $it")
        delay(1500)
    }
    return "Task 2 Done"
}

fun main() = runBlocking {

try {
    withTimeout(10000L) {
        val job1 = async { task1() }
        val job2 = async { task2() }
        println("${job1.await()}")
        println("${job2.await()}")
        job1.cancel()
        job2.cancel()
    }
}catch (e: TimeoutCancellationException){
    println(e)
    println("Tasks cancelled after 10 seconds")
}



}