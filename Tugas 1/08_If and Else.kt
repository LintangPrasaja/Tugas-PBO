fun main(){
    // Pada kondisi "If" akan dieksekusi jika kondisi tersebut benar/true
    // untuk kondisi "Else" akan dieksekusi jika kondisi tersebut salah/false

    // contoh kondisi If
    if (6 > 3){
        println("Ini adalah kondisi If \n")
    }

    // contoh kondisi If dan Else
    if (6 < 3){
        println("Ini adalah kondisi If \n")
    } else {
        println("Ini adalah kondisi Else \n")
    }

    // contoh kondisi If, Else If
    if (6 < 3){
        println("Ini adalah kondisi If \n")
    } else if (8 == 8) {
        println("Ini adalah kondisi Else If \n")
    } else {
        println("Ini adalah kondisi Else \n")
    }

    // Di Kotlin, kita juga dapat menggunakan pernyataan sebagai ekspresi (menetapkan nilai ke variabel dan mengembalikannya)
    val hasil1 = if (8 < 9) {
        "Ini adalah kondisi If (2)"
    } else {
        "Ini adalah kondisi Else (2) \n"
    }
    println(hasil1)

    // atau
    val hasil2 = if (10 < 9) "Ini adalah kondisi If (2)" else "Ini adalah kondisi Else (2) \n"
    println(hasil2)
}