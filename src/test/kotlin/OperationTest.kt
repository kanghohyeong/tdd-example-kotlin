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

    @Test
    fun testPlusReturnsSum() {
        val five = Money.dollar(5)
        val result = five.plus(five)
        val sum = result as Sum
        assertEquals(five, sum.augend)
        assertEquals(five, sum.addend)
    }

    @Test
    fun testReduceSum() {
        val sum = Sum(Money.dollar(3), Money.dollar(4))
        val bank = Bank()
        val result = bank.reduce(sum, "USD")
        assertEquals(Money.dollar(7), result)
    }

    @Test
    fun testReduceMoney() {
        val bank = Bank()
        val result = bank.reduce(Money.dollar(1), "USD")
        assertEquals(Money.dollar(1), result)
    }

    @Test
    fun testReduceMoneyDifferentCurrency() {
        val bank = Bank()
        bank.addRate("CHF", "USD", 2)
        val result = bank.reduce(Money.franc(2), "USD")
        assertEquals(Money.dollar(1), result)
    }

    @Test
    fun testIdentityRate() {
        assertEquals(1, Bank().rate("USD", "USD"))
    }

    @Test
    fun testMixedAddition() {
        val fiveBucks: Expression = Money.dollar(5)
        val tenFrancs = Money.franc(10)
        val bank = Bank()
        bank.addRate("CHF", "USD", 2)
        val result = bank.reduce(fiveBucks.plus(tenFrancs), "USD")
        assertEquals(Money.dollar(10), result)
    }
}
