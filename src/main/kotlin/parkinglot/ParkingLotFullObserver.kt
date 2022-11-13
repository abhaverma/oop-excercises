package parkinglot

interface ParkingLotFullObserver {

    fun isParkingLotFull(): Boolean

    fun notifyParkingLotFull()

    fun withdrawParkingLotFull()

}
