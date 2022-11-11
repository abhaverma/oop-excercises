package quantity

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class LengthAdditionTest {

    @Test
    fun `adding 20cm to 30cm equals 50cm`() {
        20.0.cm + 30.0.cm shouldBe 50.0.cm
    }

    @Test
    fun `adding 1m to 100cm equals 2m`() {
        1.0.m + 100.0.cm shouldBe 2.0.m
    }

    @Test
    fun `adding 200cm to 1km equals 100200cm`() {
        200.0.cm + 1.0.km shouldBe 100200.0.cm
    }
}