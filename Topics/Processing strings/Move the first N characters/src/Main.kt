fun main() {
    val (word, b) = readln().split(" ")
    val n = b.toInt()

    if (word.length < n) {
        println(word)
    } else {
        val list = word.toMutableList()

        for (i in 0 until n) {
            list.add(list[i])
        }

        for (i in 0 until n) {
            list.removeAt(0)
        }

        println(list.joinToString(""))
    }
}