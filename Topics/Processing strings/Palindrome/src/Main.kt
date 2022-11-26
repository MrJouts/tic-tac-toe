fun main() {
    val word = readln()
    var isPalindrome = true
    for (i in word.indices) {
        if (word[i] !== word[word.lastIndex - i]) isPalindrome = false
    }
    println(if (isPalindrome) "yes" else "no")
}