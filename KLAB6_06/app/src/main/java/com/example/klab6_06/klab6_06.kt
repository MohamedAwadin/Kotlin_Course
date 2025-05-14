package com.example.klab6_06

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.async
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun sumArray(numbers: IntArray): Int {
    var sum = 0
    try {
        for (num in numbers){
            println(num)
            delay(500L)
            sum += num
        }
        return sum
    } catch (e : CancellationException){
        println("Processing cancelled")
        throw e
    }
}

fun main() = runBlocking {
    val numbers = intArrayOf(1 , 2 , 3 , 4 , 5)

    //println("======================")
    println("Using join()")
    val job1 = async() { sumArray(numbers) }
    job1.join()
    val  sum = job1.await()
    println("job1 done, sum = $sum")

    //println("======================")
    println("\nUsing cancelAndJoin()")
    try {
        val job2 = launch { sumArray(numbers) }
        delay(2000L)
        job2.cancelAndJoin()
        println("job2 Cancelled")
    } catch (e : CancellationException){
        println("job2 cancellation confirmed")
    }





}