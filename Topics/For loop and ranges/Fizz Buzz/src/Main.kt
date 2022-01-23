fun main() {
    val start = readln().toInt()
    val end = readln().toInt()

    for (x in start..end) {
        if (x % 3 == 0 && x % 5 == 0) {
            println("FizzBuzz")
        } else if (x % 3 == 0) {
            println("Fizz")
        } else if (x % 5 == 0) {
            println("Buzz")
        } else {
            println(x)
        }
    }
}