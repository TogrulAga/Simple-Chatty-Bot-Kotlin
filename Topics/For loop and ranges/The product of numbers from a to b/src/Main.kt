fun main() {
    val a = readln().toLong()
    val b = readln().toLong()

    var acc = 1L

    for (x in a until b) {
        acc *= x
    }

    println(acc)
}