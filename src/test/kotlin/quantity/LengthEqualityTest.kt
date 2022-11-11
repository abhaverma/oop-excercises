package quantity

import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class LengthEqualityTest {

    @Nested
    inner class CmCmEquality {
        @Test
        fun `1 cm equals 1 cm`() {
            1.0.cm shouldBe 1.0.cm
        }

        @Test
        fun `1 cm does not equal 2 cm`() {
            1.0.cm shouldNotBe 2.0.cm
        }
    }

    @Nested
    inner class CmMEquality {
        @Test
        fun `1 cm does not equal 1 m`() {
            1.0.cm shouldNotBe 1.0.m
        }

        @Test
        fun `1 m equals 100 cm`() {
            1.0.m shouldBe 100.0.cm
        }

        @Test
        fun `100 cm equals 1 m`() {
            100.0.cm shouldBe 1.0.m
        }
    }

    @Nested
    inner class MKmEquality {
        @Test
        fun `1 m does not equal 1 km`() {
            1.0.m shouldNotBe 1.0.km
        }

        @Test
        fun `1 km equals 1000 m`() {
            1.0.km shouldBe 1000.0.m
        }

        @Test
        fun `1000 m equals 1 km`() {
            1000.0.m shouldBe 1.0.km
        }
    }

    @Nested
    inner class CMKmEquality {
        @Test
        fun `1 cm does not equal 1 km`() {
            1.0.cm shouldNotBe 1.0.km
        }

        @Test
        fun `1 km equals 100000 cm`() {
            1.0.km shouldBe 100000.0.cm
        }

        @Test
        fun `100 cm equals 0dot001 km`() {
            100.0.cm shouldBe 0.001.km
        }
    }

}