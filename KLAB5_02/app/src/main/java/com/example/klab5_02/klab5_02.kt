package com.example.klab5_02

class Person(var name: String, var id: Int, var gender: String) {
    override fun toString(): String {
        return "Person(name=$name, id=$id, gender=$gender)"
    }
}

fun main() {

    val person1: Person? = Person("Awadin", 111, "Male")
    val message = person1?.let { person ->
        "Hello, ${person.name}! Your ID is ${person.id}."
    }
    println("Message: $message")



    val person2 = Person("", 112, "Male").apply {
        name = "Hoda"
        gender = "Female"
    }
    println(person2)



    val person3 = Person("Ahmed", 113, "Male").also { person ->
        println("Created new person: ${person.name} with ID ${person.id}")
    }
    println(person3)

}