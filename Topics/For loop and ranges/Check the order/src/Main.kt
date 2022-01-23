fun main() {
    val n = readln().toInt()

    val numbers = MutableList(n) { readln().toInt() }

    println(if (numbers == numbers.sorted()) "YES" else "NO")
}