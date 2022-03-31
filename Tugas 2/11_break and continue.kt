fun main(){
    // "Break" digunakan untuk berhenti atau keluar dari perulangan.
    var i = 0
    while (i < 4) {
        println(i)
        i++
        if (i == 2) {
            break
        }
    }

    println("")

    // "Continue" memecah satu iterasi (dalam perulangan), jika kondisi tertentu terjadi,
    // dan berlanjut dengan iterasi berikutnya dalam perulangan.
    var a = 0
    while (a < 6) {
        if (a == 4) {
            a++
            continue
        }
        println(a)
        a++
    }
}