package parkinglot

class RoadTrafficCop private constructor(private val name: String, private var parkingLotFull: Boolean) :
    ParkingLotFullObserver {

    override fun isParkingLotFull(): Boolean {
        return parkingLotFull
    }

    override fun notifyParkingLotFull() {
        parkingLotFull = true
    }

    override fun withdrawParkingLotFull() {
        parkingLotFull = false
    }

    companion object {
        fun with(name: String) = RoadTrafficCop(name, false)
    }

}
