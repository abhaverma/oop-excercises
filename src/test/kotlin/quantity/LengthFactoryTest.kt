package quantity

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test
import quantity.LengthUnit.CM
import quantity.LengthUnit.KM
import quantity.LengthUnit.M

internal class LengthFactoryTest {

    @Test
    fun `1 dot cm returns length of 1cm`() {
        1.0.cm shouldBe Length(1.0, CM)
    }

    @Test
    fun `1 dot m returns length of 1m`() {
        1.0.m shouldBe Length(1.0, M)
    }

    @Test
    fun `1 dot km returns length of 1km`() {
        1.0.km shouldBe Length(1.0, KM)
    }

}