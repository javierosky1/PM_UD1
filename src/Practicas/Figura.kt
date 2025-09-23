package Practicas

interface Figura {
    fun calcularSuperficie(): Double
    fun calcularPerimetro(): Double
    fun tituloResultado() {
        println("Datos de la figura")
    }
}