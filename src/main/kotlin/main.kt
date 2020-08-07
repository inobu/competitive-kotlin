import kotlin.math.abs

fun main() {
    val n = nextInt()
    val k = nextInt()
    val xn = nextIntList()
    val ans = solve(n, k, xn)
    println(ans)
}


fun solve(n: Int, k: Int, xn: List<Int>): Int {
    return xn.map {xi ->
        val absK = abs(xi - k)
        val small = if (absK > xi) xi else absK
        2 * small
    }.sum()
}

fun nextInt(): Int {
    return readLine()!!.toInt()
}

fun nextIntList(): List<Int> {
    return readLine()!!.split(" ").map { it.toInt() }
}
