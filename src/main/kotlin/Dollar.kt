class Dollar(
    var amount: Int
) {
    fun times(mutiplier: Int) {
        amount *= mutiplier
    }
}