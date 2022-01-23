fun main() {
    val numbers = MutableList(readln().toInt()) { readln().toInt() }

    var maxPair = 0
    var currentPair = 0

    if (numbers.count() == 1) {
        println(numbers[0])
    } else {
        for ((index1, number1) in numbers.withIndex()) {
            for ((index2, number2) in numbers.withIndex()) {
                if (index1 == index2) {
                    continue
                } else {
                    currentPair = number1 * number2
                    if (currentPair > maxPair) {
                        maxPair = currentPair
                    }
                }
            }
        }
        println(maxPair)
    }

}