package quantity

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test
import quantity.LengthUnit.CM
import quantity.LengthUnit.KM
import quantity.LengthUnit.M
import quantity.WeightUnit.G
import quantity.WeightUnit.KG

class WeightFactoryTest {

    @Test
    fun `1 dot g returns weight of 1g`() {
        1.0.g shouldBe Quantity(1.0, G)
    }

    @Test
    fun `1 dot kg returns length of 1kg`() {
        1.0.kg shouldBe Quantity(1.0, KG)
    }

}