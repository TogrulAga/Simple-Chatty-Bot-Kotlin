import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val name = scanner.next()
    val surname = scanner.next()
    val age = scanner.next()

    println("${name.first()}. $surname, $age years old")
}