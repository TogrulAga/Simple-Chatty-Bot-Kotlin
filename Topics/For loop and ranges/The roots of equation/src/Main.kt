import kotlin.math.pow

fun main() {
    val (a, b, c, d) = MutableList(4) { readln().toDouble() }

    for (x in 0..1000) {
        if (a * x.toDouble().pow(3) + b * x.toDouble().pow(2) + c * x.toDouble() + d == 0.0) {
            println(x)
        }
    }
}