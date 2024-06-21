import java.util.Hashtable

class Bank {
    private val rates = Hashtable<Pair, Int>()

    fun reduce(
        source: Expression,
        to: String,
    ): Money {
        return source.reduce(this, to)
    }

    fun rate(
        from: String,
        to: String,
    ): Int {
        if (from == to) return 1
        return rates[Pair(from, to)] ?: throw RuntimeException("RATE NOT FOUND")
    }

    fun addRate(
        from: String,
        to: String,
        rate: Int,
    ) {
        rates[Pair(from, to)] = rate
    }
}

private data class Pair(private val from: String, private val to: String) {
    override fun equals(other: Any?): Boolean {
        val pair = other as Pair
        return from == pair.from && to == pair.to
    }

    override fun hashCode(): Int {
        return 0
    }
}
