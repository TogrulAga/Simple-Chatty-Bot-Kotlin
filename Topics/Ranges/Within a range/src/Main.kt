fun main() {
    val range11 = readln().toInt()
    val range12 = readln().toInt()
    val range21 = readln().toInt()
    val range22 = readln().toInt()

    val number = readln().toInt()

    println(number in range11..range12 || number in range21..range22)
}