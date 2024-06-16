class Franc(amount: Int) : Money(amount) {
    fun times(mutiplier: Int): Franc {
        return Franc(amount * mutiplier)
    }
}
