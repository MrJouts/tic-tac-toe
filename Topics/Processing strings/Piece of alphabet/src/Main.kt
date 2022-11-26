fun main() {
    val word = readln()
    var isAlphabet = true
    for (i in 1..word.lastIndex) {
        if (word[i] - word[i - 1] != 1) isAlphabet = false
    }
    println(isAlphabet)
}