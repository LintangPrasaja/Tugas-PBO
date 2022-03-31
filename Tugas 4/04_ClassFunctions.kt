class Mobil(var brand: String, var model: String, var year: Int) {
    // Class func
    fun drive() {
        println("Bruumm")
    }
}

fun main() {
    val m1 = Mobil("Kijang", "Mbee", 2013)

    m1.drive()
}