fun main() {
    val word = readln()
    val condition = word.substringAfterLast("u")
    println(word.replace(condition, condition.uppercase()))
}