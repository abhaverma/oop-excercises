package parkinglot

class ParkingLot private constructor(
    private val capacity: Int,
    private val observers: List<ParkingLotFullObserver>,
) {
    private val cars = mutableListOf<Car>()

    fun park(car: Car) {
        if (isParked(car) || isFull()) return
        cars.add(car)
        if (isFull()) {
            observers.map { it.notifyParkingLotFull() }
        }
    }

    fun isParked(car: Car): Boolean {
        return cars.contains(car)
    }

    fun parkedCount(): Int {
        return cars.count()
    }

    fun unpark(car: Car) {
        if (isFull()) {
            observers.map { it.withdrawParkingLotFull() }
        }
        cars.remove(car)
    }

    private fun isFull(): Boolean {
        return parkedCount() == capacity
    }

    companion object {
        fun with(capacity: Int, observers: List<ParkingLotFullObserver>): ParkingLot {
            if (capacity <= 0) throw IllegalArgumentException()
            return ParkingLot(capacity, observers)
        }
    }

}
