fun main(){
    // "While Loop" melakukan sesuatu secara berulang kali, dalam Looping dibagi menjadi 2 macam, yaitu While Loop dan Do-While Loop,
    // perbedaannya adalah While Loop akan melakukan perintahnya dulu, lalu melakukan iterasi.
    // Sedangkan Do-While Loop melakukan iterasi dulu, kemudian melakukan perintahnya.
    // Untuk memberhentikan secara paksa dalam Looping dapat memberikan perintah Berak.

    // While Loop
    var iterasi1 = 0
    while (iterasi1 <= 3) {
        println(iterasi1)
        iterasi1++
    }
    println("")

    // Do-While
    var iterasi2 = 0
    do {
        println(iterasi2)
        iterasi2++
    }
    while (iterasi2 <= 3)
}