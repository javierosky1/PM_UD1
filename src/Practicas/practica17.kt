package Practicas

fun main() {
    var user = Usuario("Juan", 19, "juan@gmail.com")

    var (name, age, _) = user

    println("Usuario: $name tiene $age años")
}