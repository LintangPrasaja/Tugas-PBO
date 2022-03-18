// Membuat fungsi yang berisi perkenalan diri
fun perkenalan(){
    println("Hai, saya Alif Lintang Prasaja")
}

// Membuat fungsi yang berisi hobi yang disukai
fun hobi(hobi: String){
    println("hobiku adalah $hobi")
}

// Membuat fungsi yang berisi makanan kesukaan
fun MakananFav(makanan: String, jumlah: Int){
    println("Makanan faavorit saya adalah $makanan, berjumlah $jumlah potong")
}

// Fungsi yang menggunakan "Return"
// Membuat fungsi yang berisi operasi penjumlahan
fun penjumlahan1(x: Int, y: Int):Int {
    return (x + y)
}

// Mempersingkat kodingan Fungsi yang menggunakan "Return"
fun penjumlahan2(x: Int, y: Int):Int = x + y

fun main(){
    // Memanggill fungsi yang telah dibuat
    perkenalan()
    hobi("rebahan")
    MakananFav("Rendang", 4)
    penjumlahan1(2, 2)
    penjumlahan2(3, 7)
}