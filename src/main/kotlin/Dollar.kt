class Dollar(amount: Int) : Money(amount) {
    fun times(mutiplier: Int): Dollar {
        return Dollar(amount * mutiplier)
    }
}
