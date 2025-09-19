package Practicas

fun main() {
    val coche1 = Coche("Audi", "A2")
    val coche2 = Coche("Audi", "A3", 50)
    val coche3 = Coche("Audi", "A4", 30)

    coche1.acelerar(50)
    println("Velocidad de coche1 tras acelerar: ${coche1.velocidad}")
    coche1.frenar(30)
    println("Velocidad de coche1 tras frenar: ${coche1.velocidad}")

    coche2.acelerar(30)
    println("Velocidad de coche2 tras frenar: ${coche2.velocidad}")
    coche2.frenar(50)
    println("Velocidad de coche2 tras frenar: ${coche2.velocidad}")

    coche3.frenar(80)
    println("Velocidad de coche3 tras frenar: ${coche3.velocidad}")
}