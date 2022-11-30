import kotlin.random.Random

fun main() {
    var (a, b, c, n) = readln().split(" ").map { it.toInt() }
    var newPassword = ""
    val remainder = n - a - b - c

    var next = 'u'

    repeat(n) {
        if (a != 0) {
            newPassword += Random.nextInt(65, 90).toChar()
            a--
        }

        if (b != 0) {
            newPassword += Random.nextInt(97, 122).toChar()
            b--
        }

        if (c != 0) {
            newPassword += Random.nextInt(0, 9)
            c--
        }
    }

    repeat(remainder) {
        var nextAux = 'u'

        if(next == 'l') {
            newPassword += Random.nextInt(65, 90).toChar()
            nextAux = 'u'
        }

        if(next == 'u') {
            newPassword += Random.nextInt(97, 122).toChar()
            nextAux = 'n'
        }

        if(next == 'n') {
            newPassword += Random.nextInt(0, 9)
            nextAux = 'l'
        }

        next = nextAux
    }

    println(newPassword)
}