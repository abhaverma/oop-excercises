package quantity

import quantity.LengthUnit.CM
import quantity.LengthUnit.KM
import quantity.LengthUnit.M

val Double.cm: Length
    get() {
        return Length(this, CM)
    }

val Double.m: Length
    get() {
        return Length(this, M)
    }


val Double.km: Length
    get() {
        return Length(this, KM)
    }