package parkinglot

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class RoadTrafficCopTest {

    @Test
    fun `constructs with parkingLotFull as false`() {
        val cop = RoadTrafficCop.with("")

        val isParkingLotFull = cop.isParkingLotFull()

        isParkingLotFull shouldBe false
    }

    @Test
    fun `sets parkingLotFull`() {
        val cop = RoadTrafficCop.with("")

        cop.notifyParkingLotFull()

        cop.isParkingLotFull() shouldBe true
    }

    @Test
    fun `unsets parkingLotFull`() {
        val cop = RoadTrafficCop.with("")
        cop.notifyParkingLotFull()

        cop.withdrawParkingLotFull()

        cop.isParkingLotFull() shouldBe false
    }
}