package quantity

import quantity.LengthUnit.CM
import quantity.LengthUnit.KM
import quantity.LengthUnit.M

val Double.cm: Quantity<LengthUnit>
    get() {
        return Quantity(this, CM)
    }

val Double.m: Quantity<LengthUnit>
    get() {
        return Quantity(this, M)
    }


val Double.km: Quantity<LengthUnit>
    get() {
        return Quantity(this, KM)
    }