fun main() {
    val inputString = readln()
    val n = readln().toInt()

    println("Symbol # $n of the string \"$inputString\" is '${inputString[n - 1]}'")
}