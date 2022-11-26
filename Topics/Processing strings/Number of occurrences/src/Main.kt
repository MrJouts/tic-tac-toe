fun main() {
    val sentence = readln()
    val substring = readln()
    println(sentence.split(substring).size - 1)
}