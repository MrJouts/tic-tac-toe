fun main() {
    val nucleicBase = readln().lowercase()
    var countGuanineAndCytosine = 0
    for (i in nucleicBase) {
        if (i == 'g' || i == 'c') countGuanineAndCytosine++
    }
    println(countGuanineAndCytosine.toDouble() / nucleicBase.length * 100)
}