package parkinglot

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class ParkingLotOwnerTest {

    @Test
    fun `constructs with parkingLotFull as false`() {
        val owner = ParkingLotOwner.with("")

        val isParkingLotFull = owner.isParkingLotFull()

        isParkingLotFull shouldBe false
    }

    @Test
    fun `sets parkingLotFull`() {
        val owner = ParkingLotOwner.with("")

        owner.notifyParkingLotFull()

        owner.isParkingLotFull() shouldBe true
    }

    @Test
    fun `unsets parkingLotFull`() {
        val owner = ParkingLotOwner.with("")
        owner.notifyParkingLotFull()

        owner.withdrawParkingLotFull()

        owner.isParkingLotFull() shouldBe false
    }
}