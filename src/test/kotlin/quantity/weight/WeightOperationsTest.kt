package quantity.weight

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class WeightOperationsTest {

    @Test
    fun `0dot1kg equals 100g`() {
        0.1.kg shouldBe 100.0.g
    }

    @Test
    fun `adding 10g to 1kg gives 1010g`() {
        10.0.g + 1.0.kg shouldBe 1010.0.g
    }

    @Test
    fun `1dot5kg minus 500g gives 1kg`() {
        1.5.kg - 500.0.g shouldBe 1.0.kg
    }


}