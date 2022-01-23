fun main() {
    println(MutableList(readln().toInt()) { readln().toInt() }.minOrNull())
}