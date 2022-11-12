package quantity.weight

import quantity.Quantity
import quantity.weight.WeightUnit.G
import quantity.weight.WeightUnit.KG

val Double.kg: Quantity<WeightUnit>
    get() {
        return Quantity(this, KG)
    }

val Double.g: Quantity<WeightUnit>
    get() {
        return Quantity(this, G)
    }