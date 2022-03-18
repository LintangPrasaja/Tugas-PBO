fun main(){
    // cara kerja kondisi "When" sama seperti "Switch" pada bahasa Java
    // "When" dapat menulis banyak ekspresi, dan dapat menggunakan ekspresi yang jauh lebih mudah dibaca.
    val hari = 3

    val DaftarHari = when (hari) {
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jum'at"
        6 -> "Sabtu"
        7 -> "Minggu"
        else -> "Hari tidak ditemukan."
    }
    println("Saya mengerjakan Tugas ini pada hari $DaftarHari")

}