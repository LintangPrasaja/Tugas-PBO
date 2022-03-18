class mobil {
    var warna = ""
    var TahunProduksi = 0
}

fun main(){
    // Membuat object
    val mobilku = mobil()

    // Memanggil atribut dan memberi nilai
    mobilku.warna = "Biru"
    mobilku.TahunProduksi = 2000
    println("Warna : " + mobilku.warna)
    println("Tahun : " + mobilku.TahunProduksi)
}
