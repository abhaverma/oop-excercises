package quantity.temperature

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test
import quantity.Quantity
import quantity.temperature.TemperatureUnit.C
import quantity.temperature.TemperatureUnit.F
import quantity.temperature.TemperatureUnit.K

class TemperatureFactoryTest {

    @Test
    fun `1 dot C returns temperature of 1C`() {
        1.0.C shouldBe Quantity(1.0, C)
    }

    @Test
    fun `98 dot F returns length of 98F`() {
        98.0.F shouldBe Quantity(98.0, F)
    }

    @Test
    fun `273 dot K returns length of 273K`() {
        273.0.K shouldBe Quantity(273.0, K)
    }

}