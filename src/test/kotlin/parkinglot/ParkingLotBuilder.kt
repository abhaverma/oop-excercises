package parkinglot

fun parkingLot(
    capacity: Int = 10,
    observers: List<ParkingLotFullObserver> = emptyList()
) =
    ParkingLot.with(capacity, observers)

fun car(model: String = "", make: String = "") = Car(model, make)
