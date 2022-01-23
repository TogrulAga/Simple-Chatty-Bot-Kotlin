// write your function here

fun isVowel(char: Char) = char in "aeiouAEIOU"

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}