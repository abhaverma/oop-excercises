package quantity


data class Quantity<T: Convertible<T>>(val amount: Double, val unit: T) {
    operator fun plus(other: Quantity<T>): Quantity<T> {
        return copy(amount = amount + other.amountIn(unit))
    }

    operator fun minus(other: Quantity<T>): Quantity<T> {
        return copy(amount = amount - other.amountIn(unit))
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Quantity<T>

        return amount == other.amountIn(unit)
    }

    override fun hashCode(): Int {
        var result = amount.hashCode()
        result = 31 * result + unit.hashCode()
        return result
    }

    private fun amountIn(otherUnit: T): Double {
        return if (unit == otherUnit) amount else amount * unit.conversionFactor(otherUnit)
    }

}