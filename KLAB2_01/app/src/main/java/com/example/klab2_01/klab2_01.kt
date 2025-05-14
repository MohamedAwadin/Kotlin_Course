abstract class Shape( dim: Double) {
    var dim: Double = dim
        get() = field
        set(value) {
            field = value
        }
    constructor() : this(0.0)
    abstract fun calcArea(): Double
}

class Rectangle(width: Double,  height: Double) : Shape(width) {

    var width: Double = width
        get() = field
        set(value) {
            field = value
        }
    var height: Double = width
        get() = field
        set(value) {
            field = value
        }

    constructor() : this(0.0, 0.0)
    constructor(side: Double) : this(side, side)

    override fun calcArea(): Double {
        return width * height
    }
}

class Circle(radius: Double) : Shape(radius) {

    constructor() : this(0.0)

    constructor(diameter: Double, isDiameter: Boolean) : this(if (isDiameter) diameter / 2.0 else diameter)
    override fun calcArea(): Double {
        return 3.14 * dim * dim
    }
}

class Triangle( base: Double,  height: Double) : Shape(base) {
    var base: Double = base
        get() = field
        set(value) {
            field = value
        }
    var height: Double = height
        get() = field
        set(value) {
            field = value
        }
    constructor() : this(0.0, 0.0)

    override fun calcArea(): Double {
        return 0.5 * base * height
    }
}

class Picture {

    fun sumAreas(shape1: Shape, shape2: Shape, shape3: Shape): Double {
        return shape1.calcArea() + shape2.calcArea() + shape3.calcArea()
    }
}

fun main() {

    val rectangle = Rectangle(4.0, 5.0)
    val circle = Circle(3.0, true)
    val triangle = Triangle(6.0, 8.0)
    println("${rectangle.calcArea()}")
    println("${circle.calcArea()}")
    println("${triangle.calcArea()}")
    val picture = Picture()
    val totalArea = picture.sumAreas(rectangle, circle, triangle)
    println("Total Area: $totalArea")

}