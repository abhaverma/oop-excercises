package rectangle.naive

open class RectangleNaive(private val length: Double, private val breadth: Double): Shape {

    override fun area(): Double {
        return length * breadth
    }

    override fun perimeter(): Double {
        return 2 * (length + breadth)
    }
}