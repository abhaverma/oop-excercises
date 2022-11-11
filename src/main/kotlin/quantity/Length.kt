package quantity


data class Length(val amount: Double, val unit: LengthUnit) {
    operator fun plus(other: Length): Length {
        return copy(amount = amount + other.amountIn(unit))
    }

    operator fun minus(other: Length): Length {
        return copy(amount = amount - other.amountIn(unit))
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Length

        return amount == other.amountIn(unit)
    }

    override fun hashCode(): Int {
        var result = amount.hashCode()
        result = 31 * result + unit.hashCode()
        return result
    }

    private fun amountIn(otherUnit: LengthUnit): Double {
        return if (unit == otherUnit) amount else amount * unit.conversionFactor(otherUnit)
    }

}