package quantity.temperature

import quantity.temperature.TemperatureUnit.C
import quantity.temperature.TemperatureUnit.F
import quantity.temperature.TemperatureUnit.K

private const val C_TO_F_FACTOR = 1.8
private const val C_TO_F_OFFSET = 32.0
private const val C_TO_K_OFFSET = 273.0

data class Temperature(val amount: Double, val unit: TemperatureUnit) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Temperature

        if (unit == other.unit && amount == other.amount) return true
        if (unit != other.unit) {
            val amountIn = amountIn(other.unit)
            val isEqual = amountIn == other.amount
            if (!isEqual) {
                println("Expected converted amount $amountIn to equal ${other.amount}")
            }
            return isEqual
        }

        return false
    }

    override fun hashCode(): Int {
        var result = amount.hashCode()
        result = 31 * result + unit.hashCode()
        return result
    }

    private fun amountIn(otherUnit: TemperatureUnit): Double {
        if (unit == C && otherUnit == F) {
            return (amount * C_TO_F_FACTOR) + C_TO_F_OFFSET
        }
        if (unit == F && otherUnit == C) {
            return (amount - C_TO_F_OFFSET) / C_TO_F_FACTOR
        }
        if (unit == C && otherUnit == K) {
            return amount + C_TO_K_OFFSET
        }
        return amount - C_TO_K_OFFSET
    }
}