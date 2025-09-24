package Practicas.practica19

class Novela(var titulo: String, var autor: String, var anioPublicacion: Int) {

    operator fun component1() = titulo
    operator fun component2() = autor
    operator fun component3() = anioPublicacion
}