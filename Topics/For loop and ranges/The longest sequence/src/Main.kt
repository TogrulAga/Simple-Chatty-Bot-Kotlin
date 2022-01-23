fun main() {
    val n = readln().toInt()
    val numbers = MutableList(n) { readln().toInt() }

    var maxSeq = 1
    var seqLen = 0

    for ((index, value) in numbers.withIndex()) {
        if (index == 0) {
            seqLen++
        } else if (value >= numbers[index - 1]) {
            seqLen++
        } else if (value < numbers[index - 1]) {
            if (seqLen > maxSeq) {
                maxSeq = seqLen
                seqLen = 1
            } else {
                seqLen = 1
            }
        }
    }
    if (seqLen > maxSeq) {
        println(seqLen)
    } else {
        println(maxSeq)
    }
}