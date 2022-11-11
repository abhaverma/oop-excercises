package quantity


data class Length(val amount: Double, val unit: LengthUnit) {
    operator fun plus(other: Length): Length {
        if (unit == other.unit) return copy(amount = amount + other.amount)
        val conversionFactor = other.unit.conversionFactor(unit)
        val convertedAmount = other.amount * conversionFactor
        return copy(amount = amount + convertedAmount)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Length

        if (amount == other.amount && unit == other.unit) return true
        if (unit != other.unit) {
            val convertedAmount = unit.conversionFactor(other.unit) * amount
            if (convertedAmount == other.amount) {
                return true
            } else {
                println("expected $convertedAmount to equal ${other.amount}")
            }
        }
        return false
    }

    override fun hashCode(): Int {
        var result = amount.hashCode()
        result = 31 * result + unit.hashCode()
        return result
    }

}