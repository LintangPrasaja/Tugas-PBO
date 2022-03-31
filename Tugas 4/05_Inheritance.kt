// Superclass
open class ClassOrangTua {
    val bilangan = 8
}

// Subclass
class ClassAnak: ClassOrangTua() {
    fun IsiFungsi() {
        println(bilangan) // x is now inherited from the superclass
    }
}

// Membuat objek dari "ClassAnak" dan memanggil "IsiFungsi"
fun main() {
    val Objek = ClassAnak()
    Objek.IsiFungsi()
}