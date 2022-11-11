package rectangle.inheritance

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class SquareTest {

    @Nested
    inner class Area {
        @Test
        fun `area is 1 for square of side 1`() {
            val mySquare = Square(1.0)

            val result = mySquare.area()

            result shouldBe 1.0
        }

        @Test
        fun `area is 25 for square of side 5`() {
            val mySquare = Square(5.0)

            val result = mySquare.area()

            result shouldBe 25.0
        }
    }

    @Nested
    inner class Perimeter {
        @Test
        fun `perimeter is 4 for square of side 1`() {
            val mySquare = Square(1.0)

            val result = mySquare.perimeter()

            result shouldBe 4.0
        }

        @Test
        fun `perimeter is 20 for square of side 5`() {
            val mySquare = Square(5.0)

            val result = mySquare.perimeter()

            result shouldBe 20.0
        }
    }
}