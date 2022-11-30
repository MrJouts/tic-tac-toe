fun main() {
    val url = readln()
    val parameters = url.substringAfter("?")
    val parametersList = parameters.split("&")

    for (parameter in parametersList) {
        val ps = parameter.split("=")

        if (ps[1].isEmpty()) {
            println(ps[0] + " : not found")
        } else {
            println(parameter.replace("=", " : "))
        }
    }

    for (parameter in parametersList) {
        val ps = parameter.split("=")
        if (ps[0] == "pass") {
            println("password : " + ps[1])
        }
    }
}