package com.example.klab1_05

fun main() {
    println("Enter your first name:")
    val firstName = readLine() ?: ""

    println("Enter your last name:")
    val lastName = readLine() ?: ""

    val fullName = "$firstName $lastName".trim() 
    println("Full name: $fullName")
}