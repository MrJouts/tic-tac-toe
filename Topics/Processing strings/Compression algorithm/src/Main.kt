fun main() {
    val string = readln()
    var count = 1
    var newString = ""
    for (i in 1..string.lastIndex) {
        if (string[i] == string[i - 1]) {
            count++
        } else {
            newString += string[i - 1].toString() + count
            count = 1
        }
    }
    newString += string[string.lastIndex].toString() + count
    println(newString)
}