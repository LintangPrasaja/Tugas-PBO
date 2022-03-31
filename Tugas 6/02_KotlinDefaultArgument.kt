fun displayBorder(border: Char = '=', length: Int = 15) {
    for (i in 1..length) {
        print(border)
    }
}

fun main(args: Array<String>) {
    println("Saya akan membuat garis penutup dibawah ini:")
    displayBorder()

    println("\n\nmenggunakan simbol '*'.")
    println("Output when first argument is passed:")
    displayBorder('*')

    println("\n\nmenggunakan simbol '*'.")
    println("untuk bagian ini, saya meng-outputkan hanya 8 '*' saja.")
    println("Output when both arguments are passed:")
    displayBorder('*', 8)

}