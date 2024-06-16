class Dollar(
    private val amount: Int
) {
    fun times(mutiplier: Int): Dollar {
        return Dollar(amount * mutiplier)
    }

    override fun equals(other: Any?): Boolean {
        val dollar = other as Dollar
        return amount == dollar.amount
    }
}