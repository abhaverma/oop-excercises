package quantity.temperature

import quantity.Convertible

enum class TemperatureUnit: Convertible<TemperatureUnit> {
    C {
        override fun conversionFactor(other: TemperatureUnit): Double {
            TODO("Not yet implemented")
        }
    },
    F {
        override fun conversionFactor(other: TemperatureUnit): Double {
            TODO("Not yet implemented")
        }
    },
    K {
        override fun conversionFactor(other: TemperatureUnit): Double {
            TODO("Not yet implemented")
        }
    };

}