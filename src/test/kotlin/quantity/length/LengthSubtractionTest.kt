package quantity.length

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class LengthSubtractionTest {

    @Test
    fun `50cm minus 20cm equals 30cm`() {
        50.0.cm - 20.0.cm shouldBe 30.0.cm
    }

    @Test
    fun `1m minus 50cm equals 0dot5m`() {
        1.0.m - 50.0.cm shouldBe 0.5.m
    }

    @Test
    fun `2000cm minus 1m equals 1900cm`() {
        2000.0.cm - 1.0.m shouldBe 1900.0.cm
    }
}