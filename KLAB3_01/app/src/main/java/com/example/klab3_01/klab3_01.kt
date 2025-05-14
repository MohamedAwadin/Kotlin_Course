package com.example.klab3_01

import android.location.Address


enum class Building {
    VILLA,
    APARTMENT
}


//class Person(val name: String, val address: Address) {
//
//    class Address(val streetName: String, val city: String , val building: Building)
//}


/*Data Class address outside person*/
//data class Address(val streetName: String , val city: String , val building: Building)
//
//data class Person(val name: String , val address: Address)

/*Nested data class*/
class Person(val name: String , val address: Address){
    data class Address(val streetName: String , val city: String , val building: Building)
}


fun main() {

//    val address = Person.Address("altahrir", "cairo", Building.VILLA)
//    val person = Person("Mohamed", address)
//
//
//    println("Person: ${person.name}")
//    println("Address: ${person.address.streetName}, ${person.address.city}, ${person.address.building}" )


//    val address = Address("altahrir", "cairo", Building.VILLA)
//    val person = Person("Mohamed", address)
//    println(person)

    val address = Person.Address("altahrir", "cairo", Building.VILLA)
    val person = Person("Mohamed", address)



    println(person.name)
    println(person.address)


}