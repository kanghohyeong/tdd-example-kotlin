import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MoneyTest {
    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        five.times(2)
        Assertions.assertEquals(10, five.amount)
    }
}