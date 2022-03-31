fun main(){
    // Array digunakan untuk menyimpan beberapa nilai dalam satu variabel.
    // Untuk membuat array, gunakan fungsi, dan tempatkan nilai dalam daftar yang dipisahkan koma di dalamnya "arrayOf()"
    val lauk = arrayOf("Nasi", "Rendang", "Bergedel")
    println(lauk[0])

    // Mengubah elemen dalam Array
    lauk[0] = "Kentang"
    println(lauk[0])

    // Untuk mengetahui berapa banyak elemen yang dimiliki array, gunakan fungsi "size"
    println(lauk.size)

    // Memeriksa elemen dalam Array dapat menggunakan fungsi "in"
    if ("Rendang" in lauk){
        println("Elemen ada dalam Array \n")
    } else {
        println("Tidak ada dalam Array \n")
    }

    // Untuk mengecek isi dalam array, dapat mengulang semua elemen dengan fungsi "for"
    for (x in lauk) {
        println(x)
    }
}