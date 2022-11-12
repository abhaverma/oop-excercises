package quantity

private const val KG_TO_G_FACTOR = 1000.0

enum class WeightUnit : Convertible<WeightUnit> {
    G {
        override fun conversionFactor(other: WeightUnit): Double {
            return 1 / KG_TO_G_FACTOR
        }
    },
    KG {
        override fun conversionFactor(other: WeightUnit): Double {
            return KG_TO_G_FACTOR
        }
    }
}