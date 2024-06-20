import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OperationTest {
    @Test
    fun testSimpleAddition() {
        val five = Money.dollar(5)
        val sum = five.plus(five)
        val bank = Bank()
        val reduced = bank.reduce(sum, "USD")
        assertEquals(Money.dollar(10), reduced)
    }
}
