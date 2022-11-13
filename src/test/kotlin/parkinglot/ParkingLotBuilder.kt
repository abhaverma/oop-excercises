package parkinglot

fun parkingLot(
    capacity: Int = 10,
    owner: ParkingLotOwner = ParkingLotOwner.with(""),
    cop: RoadTrafficCop = RoadTrafficCop.with("")
) =
    ParkingLot.with(capacity, owner, cop)

fun car(model: String = "", make: String = "") = Car(model, make)
