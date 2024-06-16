class Franc(
    private val amount: Int
) {
    fun times(mutiplier: Int): Franc {
        return Franc(amount * mutiplier)
    }

    override fun equals(other: Any?): Boolean {
        val dollar = other as Franc
        return amount == dollar.amount
    }
}