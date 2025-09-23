package Practicas

import kotlin.math.PI

class Circulo(var radio: Double): Figura {
    override fun calcularSuperficie(): Double = PI * (radio * radio)

    override fun calcularPerimetro(): Double = 2.0 * PI * (radio * radio)
}