package Practicas

class Rectangulo(var lado1: Double, var lado2: Double): Figura {
    override fun calcularSuperficie(): Double = lado1 * lado2

    override fun calcularPerimetro(): Double = (lado1 * 2) + (lado2 * 2)
}