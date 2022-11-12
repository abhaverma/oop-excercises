package parkinglot

import io.kotlintest.assertSoftly
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class ParkingLotTest {

    @Test
    fun `parks a car in parking lot`() {
        val car = Car("Honda City", "2019")
        val parkingLot = ParkingLot()
        parkingLot.park(car)

        val isParked = parkingLot.isParked(car)

        isParked shouldBe true
    }

    @Test
    fun `returns false when given car is not parked`() {
        val car = Car("Honda City", "2019")
        val otherCar = Car("Tata Tigor", "2022")
        val parkingLot = ParkingLot()
        parkingLot.park(car)

        val isParked = parkingLot.isParked(otherCar)

        isParked shouldBe false
    }

    @Test
    fun `parks more than one car`() {
        val car1 = Car("Honda City", "2019")
        val car2 = Car("Tata Tigor", "2022")
        val parkingLot = ParkingLot()
        parkingLot.park(car1)
        parkingLot.park(car2)

        val isParkedCar1 = parkingLot.isParked(car1)
        val isParkedCar2 = parkingLot.isParked(car2)

        assertSoftly {
            isParkedCar1 shouldBe true
            isParkedCar2 shouldBe true
        }
    }

    @Test
    fun `parked count returns 1 when 1 car is parked`() {
        val car = Car("Honda City", "2019")
        val parkingLot = ParkingLot()
        parkingLot.park(car)

        val count = parkingLot.parkedCount()

        count shouldBe 1
    }

    @Test
    fun `parked count returns 3 when 3 cars are parked`() {
        val car1 = Car("Honda City", "2019")
        val car2 = Car("Tata Tigor", "2022")
        val car3 = Car("Hyundai i20", "2020")
        val parkingLot = ParkingLot()
        parkingLot.park(car1)
        parkingLot.park(car2)
        parkingLot.park(car3)

        val count = parkingLot.parkedCount()

        count shouldBe 3
    }
}