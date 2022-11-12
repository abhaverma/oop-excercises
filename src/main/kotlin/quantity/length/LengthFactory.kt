package quantity.length

import quantity.Quantity
import quantity.length.LengthUnit.CM
import quantity.length.LengthUnit.KM
import quantity.length.LengthUnit.M

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