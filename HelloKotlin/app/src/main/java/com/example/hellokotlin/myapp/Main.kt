package com.example.hellokotlin.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
//    myAquarium.printSize()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}

fun main() {
    buildAquarium()
}