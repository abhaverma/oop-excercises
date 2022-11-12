package quantity

private const val KG_TO_G_FACTOR = 1000.0

enum class WeightUnit : Convertible {
    G {
        override fun <T> conversionFactor(other: T): Double {
            return 1 / KG_TO_G_FACTOR
        }
    },
    KG {
        override fun <T> conversionFactor(other: T): Double {
            return KG_TO_G_FACTOR
        }
    }
}