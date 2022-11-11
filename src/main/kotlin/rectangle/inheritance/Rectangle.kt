package rectangle.inheritance

open class Rectangle(private val length: Double, private val breadth: Double) {

    fun area(): Double {
        return length * breadth
    }

    fun perimeter(): Double {
        return 2 * (length + breadth)
    }
}