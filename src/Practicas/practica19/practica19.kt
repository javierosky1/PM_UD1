package Practicas.practica19

fun main() {
    val biblioteca = listOf<Novela>(
        Novela("Novela1", "autor1", 2015),
        Novela("Novela2", "autor2", 1980),
        Novela("Novela3", "autor3", 2002)
    )

    for ((title, autor, year) in biblioteca){
        println("La novela $title del autor $autor fue publicada en el año $year")
    }

    biblioteca.forEach { (title, autor, year) ->  println("La novela $title del autor $autor fue publicada en el año $year")}

}