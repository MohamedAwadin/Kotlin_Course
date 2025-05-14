package com.example.klab4_01

class Complex(val real: Double = 0.0, val img: Double = 0.0) {

    constructor(real: Int = 0, img: Int = 0) : this(real.toDouble(), img.toDouble())

    infix operator fun plus(complex: Complex): Complex {
        return Complex(this.real + complex.real, this.img + complex.img)
    }

    infix operator fun minus(complex: Complex): Complex {
        return Complex(this.real - complex.real, this.img - complex.img)
    }

    override fun toString(): String {
        return when {
            img >= 0 -> "$real + ${img}i"
            else -> "$real - ${Math.abs(img)}i"
        }
    }
}


fun Complex.printComplex() {
    println(this)
}

fun main() {
    val c1 : Complex = Complex(1,2)
    val c2: Complex = Complex(3,4)
    val c3 = c1 + c2
    val c4 = c1 - c2

    c3.printComplex()
    c4.printComplex()

    val c5 = Complex(real = 3.5 , img = 2.5)
    c5.printComplex()


}