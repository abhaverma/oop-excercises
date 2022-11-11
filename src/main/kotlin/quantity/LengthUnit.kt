package quantity

import quantity.LengthUnit.CM
import quantity.LengthUnit.KM
import quantity.LengthUnit.M


private const val M_TO_CM_FACTOR = 100.0
private const val KM_TO_M_FACTOR = 1000.0
private const val KM_TO_CM_FACTOR = KM_TO_M_FACTOR * M_TO_CM_FACTOR

enum class LengthUnit {
    CM, M, KM
}

fun LengthUnit.conversionFactor(otherUnit: LengthUnit): Double {
    if (this == KM && otherUnit == M) return KM_TO_M_FACTOR
    if (this == KM && otherUnit == CM) return KM_TO_CM_FACTOR
    if (this == M && otherUnit == CM) return M_TO_CM_FACTOR
    if (this == CM && otherUnit == KM) return 1 / KM_TO_CM_FACTOR
    if (this == CM) return 1 / M_TO_CM_FACTOR
    return 1 / KM_TO_M_FACTOR
}