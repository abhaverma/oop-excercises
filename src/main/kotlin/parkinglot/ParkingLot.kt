package parkinglot

class ParkingLot {
    private val cars = mutableListOf<Car>()

    fun park(car: Car) {
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

}
