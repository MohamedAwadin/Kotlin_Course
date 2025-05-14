package com.example.klab1_03

fun main() {
    println("Enter the first number:")
    val num1 = readLine()?.toDoubleOrNull()
    if (num1 == null) {
        println("Please enter a valid number.")
        return
    }

    println("Enter the second number:")
    val num2 = readLine()?.toDoubleOrNull()
    if (num2 == null) {
        println("Please enter a valid number.")
        return
    }

    println("Choose an operation (ADD, SUB, MUL, DIV):")
    val operation = readLine()?.uppercase()

    val result = when (operation) {
        "ADD" -> num1 + num2
        "SUB" -> num1 - num2
        "MUL" -> num1 * num2
        "DIV" -> {
            if (num2 == 0.0) {
                println("Division by zero is not allowed.")
                return
            }
            num1 / num2
        }
        else -> {
            println("Invalid operation. Please choose ADD, SUB, MUL, or DIV.")
            return
        }
    }

    println("Result: $num1 $operation $num2 = $result")
}