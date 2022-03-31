class Mobil(var brand: String, var model: String, var year: Int)

fun main() {
    val c1 = Mobil("Kijang", "Mbee", 2013)

    println(c1.brand)
    println(c1.model)
    println(c1.year)
}