package quantity

private const val M_TO_CM_FACTOR = 100.0
private const val KM_TO_M_FACTOR = 1000.0
private const val KM_TO_CM_FACTOR = KM_TO_M_FACTOR * M_TO_CM_FACTOR

enum class LengthUnit : Convertible<LengthUnit> {
    CM {
        override fun conversionFactor(other: LengthUnit): Double {
            if (other == KM) return 1 / KM_TO_CM_FACTOR
            return 1 / M_TO_CM_FACTOR
        }
    }, M {
        override fun conversionFactor(other: LengthUnit): Double {
            if(other == CM) return M_TO_CM_FACTOR
            return 1 / KM_TO_M_FACTOR
        }
    }, KM {
        override fun conversionFactor(other: LengthUnit): Double {
            if(other == M) return KM_TO_M_FACTOR
            return KM_TO_CM_FACTOR
        }
    }
}