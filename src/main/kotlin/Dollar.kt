class Dollar(amount: Int) : Money(amount) {
    override fun times(mutiplier: Int): Money {
        return Dollar(amount * mutiplier)
    }
}
