package com.example.klab3_02

interface NumberSeries{
    var start: Int
    var current : Int
    fun reset()
    fun getNext(): Int
}

class ByTwo() : NumberSeries{
    override var start: Int = 0
    override var current: Int = 0
    set(value){

        field = value
    }
    override fun reset() {

        current = start
    }

    override fun getNext(): Int {

        current +=2
        return  current
    }
}

class ByThree() : NumberSeries{
    override var start: Int = 0
    override var current: Int = 0
        set(value){
//            current = value
            field = value
        }
    override fun reset() {

        current = start
    }

    override fun getNext(): Int {

        current +=3
        return  current
    }
}

fun main(){
    var byTwos = ByTwo()
    var byThree = ByThree()
    var ref : NumberSeries
    repeat(5) {
        ref  = byTwos
        println("By two: ${ref.getNext()}")
        ref = byThree
        println("By three: ${ref.getNext()}")

    }
}