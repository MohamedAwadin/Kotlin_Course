package com.example.klab6_05

import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

suspend fun sumArray(numbers : IntArray): Int = withTimeout(500L) {
    var sum = 0
    numbers.forEach {
        delay(100L)
        sum+=it
    }
    sum
}

fun main() = runBlocking {
    val arrays = listOf(
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(0, 10, -5, 20),
        intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 , 30 , 60 , 70 , 80 , 90 , 100 , 200 )
    )

    arrays.forEach { array ->
        try {
            val result = sumArray(array)
            println("Sum  $result")


        }catch (e: TimeoutCancellationException){
            println("timed out after 5 seconds")

        }
    }
}