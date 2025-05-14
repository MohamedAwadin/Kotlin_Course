package com.example.klec5

import android.os.Build
import androidx.annotation.RequiresApi


class NumericItem<T : Number>{

}

@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
fun main(){

//    val mutableList2 = mutableListOf("one", "two", "three")
//    val mutableListIterator = mutableList2.listIterator()
//    mutableListIterator.next()
//    mutableListIterator.add("Four")
//    mutableList2.forEach {
//        println(it)
//    }
//    print(mutableList2)

//    val number = NumericItem<Int>()
//    val number2 = NumericItem<Double>()
//    val number3 = NumericItem<String>()

    val numbers : List<Int> = listOf(44,2,3,2,5)
    println(numbers)
    println(numbers[0])
    println(numbers.size)
    println(numbers.contains(2))

    val fruits: MutableList<String> = mutableListOf("apple","banana")
    fruits.add("Orange")
    fruits.remove("banana")
    fruits[0] = "Mango"
    println(fruits)

    println(numbers.sorted())
    println(numbers.reversed())
    numbers.forEach { println(it) }

    println("---------------------------------------")

    val uniqueNumbers: Set<Int> = setOf(1,2,2,4,5) // Ignore Duplicate
    println(uniqueNumbers)
    println(uniqueNumbers.contains(2))
    println(uniqueNumbers.size)

    val tags: MutableSet<String> = mutableSetOf("Kotlin", "Android")
    tags.add("Java")
    tags.remove("Android")
    println(tags)

    val set1 = setOf(1,2,3)
    val set2 = setOf(2,3,4)
    println(set1 union set2)
    println(set1 intersect set2)
    println(set1 subtract set2)

    println("---------------------------------------")

    val scores: Map<String , Int> = mapOf("Awadin" to 90 , "Bob" to 85)
    println(scores)
    println(scores["Awadin"])
    println(scores.contains("Bob"))
    println(scores.keys)
    println(scores.values)

    val config: MutableMap<String, String> = mutableMapOf("theme" to "dark")
    config["font"] = "Arial"
    config.remove("theme")
    println(config)


    scores.forEach { (key, value) -> println("$key: $value")}
    println(scores.filter { it.value > 85 })

    println("---------------------------------------")





}