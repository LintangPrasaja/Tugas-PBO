class Buku(){
    var judul = ""
    var pengarang = ""
    var penerbit = ""
    var tahun = 0
}

fun main(){
    val Buku1 = Buku()

    Buku1.judul = "Pemrograman Berbasis Objek"
    Buku1.pengarang = "Alif Lintang Prasaja"
    Buku1.penerbit = "Oreo"
    Buku1.tahun = 2088

    println("Judul \t\t:" + Buku1.judul)
    println("Pengarang \t:" + Buku1.pengarang)
    println("Penerbit \t:" + Buku1.penerbit)
    println("Tahun \t\t:" + Buku1.tahun)
}
