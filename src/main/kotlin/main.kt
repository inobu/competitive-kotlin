fun main() {
    val s = nextString()
    val ans = solve(s)
    println(ans)
}


//A,C,G,T
fun solve(s: String): Int {
    val length = s.length
    var max = 0

    for (i in 0..length) {
        for (j in i..length) {
            val acgt = s.substring(i, j)
            val acgtLength = acgt.takeWhile {
                it == 'A'
                        || it == 'C'
                        || it == 'G'
                        || it == 'T'
            }.length
            if (acgtLength == acgt.length) {
                max = acgt.length.coerceAtLeast(max)
            }
        }
    }

    return max
}

fun nextInt(): Int {
    return readLine()!!.toInt()
}

fun nextIntList(): List<Int> {
    return readLine()!!.split(" ").map { it.toInt() }
}

fun nextString(): String {
    return readLine()!!
}