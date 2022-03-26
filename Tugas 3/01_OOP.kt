class Fruit{
    var fruit1 = ""
    var fruit2 = ""
    var fruit3 = ""
}

class Car{
    var car1 = ""
    var car2 = ""
    var car3 = ""
}

fun main() {
    val f1 = Fruit()
    val f2 = Fruit()
    val f3 = Fruit()

    f1.fruit1 = "Apple"
    f2.fruit2 = "Banana"
    f3.fruit3 = "Mango"

    println(f1.fruit1)
    println(f2.fruit2)
    println(f3.fruit3 + "\n")

    val c1 = Car()
    val c2 = Car()
    val c3 = Car()

    c1.car1 = "Volvo"
    c2.car2 = "Audi"
    c3.car3 = "Toyota"

    println(c1.car1)
    println(c2.car2)
    println(c3.car3)
}
