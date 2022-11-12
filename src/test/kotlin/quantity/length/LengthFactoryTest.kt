package quantity.length

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test
import quantity.Quantity
import quantity.length.LengthUnit.CM
import quantity.length.LengthUnit.KM
import quantity.length.LengthUnit.M

internal class LengthFactoryTest {

    @Test
    fun `1 dot cm returns length of 1cm`() {
        1.0.cm shouldBe Quantity(1.0, CM)
    }

    @Test
    fun `1 dot m returns length of 1m`() {
        1.0.m shouldBe Quantity(1.0, M)
    }

    @Test
    fun `1 dot km returns length of 1km`() {
        1.0.km shouldBe Quantity(1.0, KM)
    }

}