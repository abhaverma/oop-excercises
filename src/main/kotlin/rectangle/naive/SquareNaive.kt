package rectangle.naive

class SquareNaive(private val side: Double): Shape {
    override fun area(): Double {
        return side * side
    }

    override fun perimeter(): Double {
        return 4 * side
    }
}
