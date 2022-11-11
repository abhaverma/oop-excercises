package rectangle.naive

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class RectangleNaiveTest {

    @Nested
    inner class Area {
        @Test
        fun `area is 1 for length 1 and breadth 1`() {
            val rectangle = RectangleNaive(1.0, 1.0)

            val result = rectangle.area()

            result shouldBe 1.0
        }

        @Test
        fun `area is 6 for length 3 and breadth 2`() {
            val rectangle = RectangleNaive(3.0, 2.0)

            val result = rectangle.area()

            result shouldBe 6.0
        }
    }

    @Nested
    inner class Perimeter {
        @Test
        fun `perimeter is 4 for length 1 and breadth 1`() {
            val rectangle = RectangleNaive(1.0, 1.0)

            val result = rectangle.perimeter()

            result shouldBe 4.0
        }

        @Test
        fun `perimeter is 10 for length 3 and breadth 2`() {
            val rectangle = RectangleNaive(3.0, 2.0)

            val result = rectangle.perimeter()

            result shouldBe 10.0
        }
    }
}