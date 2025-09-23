package Practicas

fun main() {
    val coche1 = CocheTuneado("Audi", "a2")

    println("Información del coche:\nMarca: ${coche1.marca}\nModelo: ${coche1.modelo}")

    coche1.acelerar(50)
    println("Velocidad de coche1 tras acelerar: ${coche1.velocidad}")
    coche1.frenar(30)
    println("Velocidad de coche1 tras frenar: ${coche1.velocidad}")
}