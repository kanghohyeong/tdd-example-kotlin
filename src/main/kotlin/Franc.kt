class Franc(amount: Int) : Money(amount) {
    override fun times(mutiplier: Int): Money {
        return Franc(amount * mutiplier)
    }
}
