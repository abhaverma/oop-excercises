package quantity.temperature

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class TemperatureOperationsTest {

    @Test
    fun `0C equals 0C`() {
        0.0.C shouldBe 0.0.C
    }

    @Test
    fun `0C equals 32F`() {
        0.0.C shouldBe 32.0.F
    }

    @Test
    fun `113F equals 45C`() {
        113.0.F shouldBe 45.0.C
    }

    @Test
    fun `10C equals 50F`() {
        10.0.C shouldBe 50.0.F
    }

    @Test
    fun `0K equals -273C`() {
        0.0.K shouldBe (-273.0).C
    }

    @Test
    fun `10K equals -263C`() {
        10.0.K shouldBe (-263.0).C
    }

    @Test
    fun `0C equals 273K`() {
        0.0.C shouldBe (273.0).K
    }

    @Test
    fun `10C equals 283K`() {
        10.0.C shouldBe (283.0).K
    }
}