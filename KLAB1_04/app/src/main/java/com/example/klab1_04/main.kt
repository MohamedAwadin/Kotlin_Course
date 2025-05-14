package com.example.klab1_04

fun main() {
    val n = 5

    for (i in 0 until n) {
        for (j in 0 until 3 * n) {
            when {
                j <= i -> print("*")
                j >= (2 * n - i) && j <= (2 * n + i) -> print("*")
                else -> print(" ")
            }
        }
        println()
    }
}