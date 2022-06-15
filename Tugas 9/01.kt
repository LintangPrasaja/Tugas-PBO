fun main() {
    println("Masukan input detik: ")
    var detik = readln().toInt()

    var jam = detik/(60*60)
    detik = detik - ((60*60)*jam)
    var menit = detik / 60
    detik = detik - (60*menit)

    println(jam.toString()  + ":" + menit.toString() + ":" + detik.toString())
}
