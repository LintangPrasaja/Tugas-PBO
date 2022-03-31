fun menambahkanBilangan(b1: String, b2: String): Int {
    val bilangan = b1 + b2
    val konversiInt = bilangan.toInt()
    return konversiInt
}

fun main(args: Array<String>) {
    val number1 = "8"
    val number2 = "2"
    val result: Int

    result = menambahkanBilangan(number1, number2)
    println("result = $result")
}