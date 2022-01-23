fun main() {
    val (a, b, n) = MutableList(3) { readln().toInt() }
    var nDivisible = 0

    for (x in a..b) {
        if (x % n == 0) {
            nDivisible++
        }
    }

    println(nDivisible)
}