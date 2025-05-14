package com.example.klab5_03

fun calculate(a: Double, b: Double, operation: (Double, Double) -> Double): Double {
    return operation(a, b)
}


fun add(a: Double, b: Double): Double = a + b
fun subtract(a: Double, b: Double): Double = a - b
fun multiply(a: Double, b: Double): Double = a * b
fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        println("Division by zero is not allowed")
        return 0.0;
    }
    else{
        return a / b
    }

}

fun main() {


    println("Add: ${calculate(10.0, 5.0, ::add)}")
    println("Sub: ${calculate(10.0, 5.0, ::subtract)}")
    println("Mult: ${calculate(10.0, 5.0, ::multiply)}")
    println("Div: ${calculate(10.0, 5.0, ::divide)}")


    val result1 = calculate(20.0, 4.0) { x, y -> x + y }
    println("Add: $result1")
    val result2 = calculate(20.0, 4.0) { x, y -> x - y }
    println("Sub: $result2")
    val result3 = calculate(20.0, 4.0) { x, y -> x * y }
    println("Mult: $result3")
    val result4 = calculate(20.0, 4.0) { x, y -> x / y }
    println("Div: $result4")
}