package Practicas

fun main() {
    var lib = Libro("titulo1", "autor1", 2005)

    var (title, autor, year) = lib

    println("El libro $title del autor $autor fue publicado en el año $year")
}