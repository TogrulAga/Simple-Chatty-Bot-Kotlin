fun main() {
    val number = readln().toInt()
    val range1 = readln().toInt()
    val range2 = readln().toInt()

    println(number in range1..range2)
}