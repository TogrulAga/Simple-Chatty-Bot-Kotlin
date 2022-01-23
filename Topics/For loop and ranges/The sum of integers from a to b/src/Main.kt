fun main() {
    var sum = 0

    for (x in readln().toInt()..readln().toInt()) {
        sum += x
    }
    println(sum)
}