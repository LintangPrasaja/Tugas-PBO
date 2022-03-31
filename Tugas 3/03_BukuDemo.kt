class BukuDemo(){
    var judul = ""
    var pengarang = ""
    var penerbit = ""
    var tahun = 0
}

fun main(){
    val Buku1 = BukuDemo()
    val Buku2 = BukuDemo()

    Buku1.judul = "Pemrograman Berbasis Objek"
    Buku1.pengarang = "Indra"
    Buku1.penerbit = "Elex"
    Buku1.tahun = 2007

    Buku2.judul = "Java"
    Buku2.pengarang = "Ajib"
    Buku2.penerbit = "Andi"
    Buku2.tahun = 2007

    println("Judul \t\t:" + Buku1.judul)
    println("Pengarang \t:" + Buku1.pengarang)
    println("Penerbit \t:" + Buku1.penerbit)
    println("Tahun \t\t:" + Buku1.tahun)

    println("Judul \t\t:" + Buku2.judul)
    println("Pengarang \t:" + Buku2.pengarang)
    println("Penerbit \t:" + Buku2.penerbit)
    println("Tahun \t\t:" + Buku2.tahun)
}
