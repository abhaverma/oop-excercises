package quantity

import quantity.WeightUnit.G
import quantity.WeightUnit.KG

val Double.kg: Quantity<WeightUnit>
    get() {
        return Quantity(this, KG)
    }

val Double.g: Quantity<WeightUnit>
    get() {
        return Quantity(this, G)
    }