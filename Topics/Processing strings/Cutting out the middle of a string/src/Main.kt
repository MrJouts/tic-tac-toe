fun main() {
    var word = readln()
    val middle = word.length / 2

    if (word.length % 2 == 0) {
        print(word.substring(0, middle - 1) + word.substring(middle + 1))
    } else {
        print(word.substring(0, middle) + word.substring(middle + 1))
    }
}