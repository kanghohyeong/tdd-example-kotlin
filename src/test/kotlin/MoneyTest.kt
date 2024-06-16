import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MoneyTest {
    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        var product = five.times(2)
        Assertions.assertEquals(10, product.amount)
        product = five.times(3)
        Assertions.assertEquals(15, product.amount)
    }
}