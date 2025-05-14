package com.example.klab6_02

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        launch {
            for (i in 1..10){
                println(i)
                delay(200)
            }
        }
    }
}