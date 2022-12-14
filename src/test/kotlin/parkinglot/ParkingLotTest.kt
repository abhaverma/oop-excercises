package parkinglot

import io.kotlintest.assertSoftly
import io.kotlintest.shouldBe
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ParkingLotTest {

    @Nested
    inner class Capacity {

        @Test
        fun `does not park when parking lot is full`() {
            val parkingLot = parkingLot(1)
            val car1 = car()
            val car2 = car()
            parkingLot.park(car1)
            parkingLot.park(car2)

            val isCar2Parked = parkingLot.isParked(car2)

            isCar2Parked shouldBe false
        }

        @Test
        fun `notifies observers when parking lot becomes full`() {
            val observer1 = mockk<ParkingLotFullObserver>(relaxed = true)
            val observer2 = mockk<ParkingLotFullObserver>(relaxed = true)
            val parkingLot = parkingLot(capacity = 1, observers = listOf(observer1, observer2))
            val car = car()

            parkingLot.park(car)

            verify { observer1.notifyParkingLotFull() }
            verify { observer2.notifyParkingLotFull() }
        }


        @Test
        fun `withdraws notice to observers when parking lot has space available`() {
            val observer1 = mockk<ParkingLotFullObserver>(relaxed = true)
            val observer2 = mockk<ParkingLotFullObserver>(relaxed = true)
            val parkingLot = parkingLot(capacity = 1, observers = listOf(observer1, observer2))
            val car = car()

            parkingLot.park(car)
            parkingLot.unpark(car)

            verify { observer1.withdrawParkingLotFull() }
            verify { observer2.withdrawParkingLotFull() }
        }

        @Test
        fun `throws illegal argument for negative capacity`() {
            assertThrows<IllegalArgumentException> { parkingLot(-10) }
        }

        @Test
        fun `throws illegal argument for 0 capacity`() {
            assertThrows<IllegalArgumentException> { parkingLot(0) }
        }
    }

    @Nested
    inner class Park {

        @Test
        fun `parks a car in parking lot`() {
            val car = car()
            val parkingLot = parkingLot()
            parkingLot.park(car)

            val isParked = parkingLot.isParked(car)

            isParked shouldBe true
        }

        @Test
        fun `returns false when given car is not parked`() {
            val car = car()
            val otherCar = car()
            val parkingLot = parkingLot()
            parkingLot.park(car)

            val isParked = parkingLot.isParked(otherCar)

            isParked shouldBe false
        }

        @Test
        fun `parks more than one car`() {
            val car1 = car()
            val car2 = car()
            val parkingLot = parkingLot()
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
        fun `does not park same car twice`() {
            val car1 = car()
            val parkingLot = parkingLot()
            parkingLot.park(car1)
            parkingLot.park(car1)

            parkingLot.parkedCount() shouldBe 1
        }

        @Test
        fun `parked count returns 1 when 1 car is parked`() {
            val car = car()
            val parkingLot = parkingLot()
            parkingLot.park(car)

            val count = parkingLot.parkedCount()

            count shouldBe 1
        }

        @Test
        fun `parked count returns 3 when 3 cars are parked`() {
            val car1 = car()
            val car2 = car()
            val car3 = car()
            val parkingLot = parkingLot()
            parkingLot.park(car1)
            parkingLot.park(car2)
            parkingLot.park(car3)

            val count = parkingLot.parkedCount()

            count shouldBe 3
        }
    }

    @Nested
    inner class Unpark {

        @Test
        fun `parked count reduces when a car is un parked`() {
            val car1 = car()
            val car2 = car()
            val parkingLot = parkingLot()
            parkingLot.park(car1)
            parkingLot.park(car2)

            parkingLot.unpark(car1)

            parkingLot.parkedCount() shouldBe 1
        }

        @Test
        fun `returns false when given car is un parked`() {
            val car = car()
            val parkingLot = parkingLot()
            parkingLot.park(car)

            parkingLot.unpark(car)

            val isParked = parkingLot.isParked(car)

            isParked shouldBe false
        }

        @Test
        fun `unparks more than 1 car`() {
            val car1 = car()
            val car2 = car()
            val parkingLot = parkingLot()
            parkingLot.park(car1)
            parkingLot.park(car2)

            parkingLot.unpark(car1)
            parkingLot.unpark(car2)

            parkingLot.parkedCount() shouldBe 0
        }
    }

}