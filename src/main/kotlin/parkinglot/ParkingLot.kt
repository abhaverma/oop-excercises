package parkinglot

class ParkingLot private constructor(private val capacity: Int) {
    private val cars = mutableListOf<Car>()

    fun park(car: Car) {
        if (capacity == parkedCount()) return
        cars.add(car)
    }

    fun isParked(car: Car): Boolean {
        return cars.contains(car)
    }

    fun parkedCount(): Int {
        return cars.count()
    }

    fun unpark(car: Car) {
        cars.remove(car)
    }

    fun isFull(): Boolean {
        return capacity == parkedCount()
    }

    companion object {
        fun withCapacity(capacity: Int): ParkingLot {
            if (capacity <= 0) throw IllegalArgumentException()
            return ParkingLot(capacity)
        }
    }

}
