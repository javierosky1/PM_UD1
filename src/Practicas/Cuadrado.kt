package Practicas

class Cuadrado(var lado: Double) : Figura {
    override fun calcularSuperficie(): Double = lado * lado

    override fun calcularPerimetro(): Double = lado * 4
}