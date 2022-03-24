class mobil{
    var brand = ""
    var model = ""
    var year = 0
}

fun main() {
    val c1 = mobil()

    c1.brand = "Kijang"
    c1.model ="Mbee"
    c1.year = 2013

    println(c1.brand)
    println(c1.model)
    println(c1.year)
}