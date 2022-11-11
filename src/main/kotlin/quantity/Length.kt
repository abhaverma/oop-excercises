package quantity


class Length(val amount: Double, val unit: LengthUnit) {

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

    override fun toString(): String {
        return "Length(amount=$amount, unit='$unit')"
    }
}

