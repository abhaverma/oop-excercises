package parkinglot

fun parkingLot(capacity: Int = 10, owner: ParkingLotOwner = ParkingLotOwner.with("")) =
    ParkingLot.with(capacity, owner)

fun car(model: String = "", make: String = "") = Car(model, make)
