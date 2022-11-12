package quantity.temperature

import quantity.Quantity

val Double.C: Quantity<TemperatureUnit>
    get() {
        return Quantity(this, TemperatureUnit.C)
    }

val Double.F: Quantity<TemperatureUnit>
    get() {
        return Quantity(this, TemperatureUnit.F)
    }

val Double.K: Quantity<TemperatureUnit>
    get() {
        return Quantity(this, TemperatureUnit.K)
    }
