fun penjumlahan (x: Int, y: Int) = x + y
fun pengurangan (x: Int, y: Int) = x - y
fun perkalian (x: Int, y: Int) = x * y
fun pembagian (x: Int, y: Int) = x / y
fun tampil (x: Int, y: Int, result: Int){
    println("$x + $y = $result")
}

fun main() {
    val pilihan = """
        1. Penjumlahan
        2. Pengurangan
        3. Perkalian
        4. Pembagian
        Masukan pilihan anda :
    """.trimIndent()
    print(pilihan)
    val pilih = readln().toInt()

    print("Masukan angka pertama : ")
    val num1 = readln().toInt()

    print("masukan angka kedua : ")
    val num2 = readln().toInt()
    if (pilih == 1){
        val hasil = penjumlahan(num1, num2)
        tampil(num1, num2, hasil)
    } else if (pilih == 2){
        val hasil = pengurangan(num1, num2)
        tampil(num1, num2, hasil)
    } else if (pilih == 3){
        val hasil = perkalian(num1, num2)
        tampil(num1, num2, hasil)
    } else if (pilih == 4){
        val hasil = pembagian(num1, num2)
        tampil(num1, num2, hasil)
    } else {
        println("Input yang anda masukan tidak ada dalam pilihan")
    }

}