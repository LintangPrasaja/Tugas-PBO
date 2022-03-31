fun main(){
    var string1 = "Alif Lintang Prasaja"
    var string2 = "Saya seorang Mahasiswa dari Universitas Udinus"

    // Mengabungkan string dengan variabel lainnya, teknik ini disebut "concatenation"
    // untuk melakukan "concatenation" dapat menambahkan "+" diantara string yang ingin di hubungkan
    var NamaTengah = "Lintang"
    var NamaBelakang = "Prasaja"
    println("Panggilan saya " + NamaTengah + ", dan nama belakang saya adalah " + NamaBelakang)
    // atau dapat menggunakan tanda "$"
    println("Panggilan saya $NamaTengah, dan nama belakang saya adalah $NamaBelakang\n")

    // Menghitung panjang jumlah string dapat menggunakan fungsi "Nama_String.length"
    println("Jumlah string : " + string1.length + "\n")

    // Membesarkan semua tulisan dalam string dapat menggunakan fungsi "Nama_String.toUpperCase"
    println("Membuat tulisan kapital : " + string1.toUpperCase())
    // Mengecilkan semua tulisan dalam string dapat menggunakan fungsi "Nama_String.toLowerCase"
    println("Membuat tulisan kecil semua : " + string1.toLowerCase() + "\n")

    // Mencari sebuah kata dalam string dapat menggunakan fungsi "Nama_String.indexOf"
    println("Letak kata 'Udinus' pada indeks : " + string2.indexOf("Udinus"))
}