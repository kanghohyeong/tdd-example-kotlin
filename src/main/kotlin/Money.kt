class Money(val amount: Int, private val currency: String) : Expression {
    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Money(amount, "CHF")
        }
    }

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    fun plus(addend: Money): Expression {
        return Sum(this, addend)
    }

    override fun reduce(
        bank: Bank,
        to: String,
    ): Money {
        val rate = bank.rate(currency, to)
        return Money(amount / rate, to)
    }

    fun currency(): String {
        return currency
    }

    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount && currency == money.currency
    }

    override fun toString(): String {
        return "$amount $currency"
    }
}
