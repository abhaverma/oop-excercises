package parkinglot

class ParkingLotOwner private constructor(private val name: String, private var parkingLotFull: Boolean) {


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
        fun with(name: String) = ParkingLotOwner(name, false)
    }


}
