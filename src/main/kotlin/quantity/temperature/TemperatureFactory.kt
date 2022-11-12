package quantity.temperature

val Double.C: Temperature
    get() {
        return Temperature(this, TemperatureUnit.C)
    }

val Double.F: Temperature
    get() {
        return Temperature(this, TemperatureUnit.F)
    }

val Double.K: Temperature
    get() {
        return Temperature(this, TemperatureUnit.K)
    }
