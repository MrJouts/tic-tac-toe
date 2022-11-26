const val HALF = 3

fun main() {
    val ticket = readln()

    var first = 0
    var second = 0

    for (i in ticket.indices) {
        if (i < HALF) first += ticket[i].toString().toInt() else second += ticket[i].toString().toInt()
    }
    println(if (first == second) "Lucky" else "Regular")
}