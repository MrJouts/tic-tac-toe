fun main() {
    val sentence = readln()
    val list = sentence.split(" ")
    var longest = ""
    for (word in list) {
        if (word.length > longest.length) longest = word
    }
    println(longest)
}