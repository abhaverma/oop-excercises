package quantity

interface Convertible<T> {
    fun conversionFactor(other: T): Double
}