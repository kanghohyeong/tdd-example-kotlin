abstract class Money(protected val amount: Int, private val currency: String) {
    companion object {
        fun dollar(amount: Int): Money {
            return Dollar(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Franc(amount, "CHF")
        }
    }

    abstract fun times(multiplier: Int): Money

    fun currency(): String {
        return currency
    }

    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount && (this::class == money::class)
    }
}
