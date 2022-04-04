fun main() {
    val x = 6

    when (x) {
        1, 2, 3, 4, 5 -> println("x adalah bilangan positif.")
        0 -> println("x sudah dipastikan 0")
        -1, -2, -3, -4, -5 -> println("x adalah bilangan minus.")
        else -> println("Bilangan x yang diinputkan tidak terdeteksi")
    }
}