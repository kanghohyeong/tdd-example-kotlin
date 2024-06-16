class Dollar(
    var amount: Int
) {
    fun times(mutiplier: Int): Dollar {
        return Dollar(amount * mutiplier)
    }
}