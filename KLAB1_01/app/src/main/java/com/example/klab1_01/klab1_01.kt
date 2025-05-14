package com.example.klab1_01

fun main() {
    println("Please enter your name:")
    val name = readLine() ?: ""
    val finalName = if (name.isBlank()) "Guest" else name
    val greeting = if (finalName == "Guest") {
        "Hello, unknown user!"
    } else {
        "Welcome, $finalName!"
    }
    println(greeting)
}