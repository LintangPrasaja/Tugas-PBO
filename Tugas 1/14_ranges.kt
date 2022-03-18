fun main(){
    // Range dapat dibuat dengan "For"
    // ini adalah contoh Range string
    for (chars in 'a'..'d') {
        println(chars)
    }
    println("")

    // ini adalah contoh Range integer
    for (bilangan1 in 1..4) {
        println(bilangan1)
    }
    println("")

    // Memeriksa nilai/elemen dalam Range
    val bilangan2 = arrayOf(1, 5, 9, 13)
    if (9 in bilangan2) {
        println("Bilangan yang dicari ADA dalam Range")
    } else {
        println("Bilangan yang dicari TIDAK ADA dalam Range")
    }
    println("")

    // Break
    for (bilangan3 in 5..15) {
        if (bilangan3 == 10) {
            break
        }
        println(bilangan3)
    }
    println("")

    // Continue
    for (bilangan4 in 2..6) {
        if (bilangan4 == 4) {
            continue
        }
        println(bilangan4)
    }
}