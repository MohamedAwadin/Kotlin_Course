package com.example.klab1_02

import java.util.Random

fun main() {

    val random = Random()
    val numbers = Array(100) { random.nextInt(100) + 1 }


    println("Numbers less than or equal to 10:")

    for (x in numbers){
        if (x<=10){
            println(x)
        }
    }
}