package parkinglot

class RoadTrafficCop private constructor(private val name: String, private var parkingLotFull: Boolean) {


    fun isParkingLotFull(): Boolean {
        return parkingLotFull
    }

    fun notifyParkingLotFull() {
        parkingLotFull = true
    }

    fun withdrawParkingLotFull() {
        parkingLotFull = false
    }

    companion object {
        fun with(name: String) = RoadTrafficCop(name, false)
    }


}
