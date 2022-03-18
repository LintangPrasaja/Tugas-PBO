fun main(){
    // Untuk mengoperasikan array, kita perlu mengulang semua elemen.
    // Untuk loop melalui elemen array dapat menggunakan fungsi "for in"
    val lauk = arrayOf("Nasi", "Rendang", "Bergedel")
    for (x in lauk) {
        println(x)
    }
    println("")

    // semua jenis array dapat kita loop. Pada contoh di atas menggunakan array string
    // untuk menggunakan array bilangan bulat tidak beda jauh.
    val no = arrayOf(2, 4, 6, 8)
    for (x in no) {
        println(x)
    }
}