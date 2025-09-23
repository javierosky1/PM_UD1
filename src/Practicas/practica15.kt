package Practicas

fun main() {
    val cuadrado1 = Cuadrado(10.0)
    cuadrado1.tituloResultado()
    println("Perímetro del cuadrado : ${cuadrado1.calcularPerimetro()}")
    println("Superficie del cuadrado : ${cuadrado1.calcularSuperficie()}")

    val rectangulo1 = Rectangulo(10.0, 5.0)
    rectangulo1.tituloResultado()
    println("Perímetro del rectángulo : ${rectangulo1.calcularPerimetro()}")
    println("Superficie del rectángulo : ${rectangulo1.calcularSuperficie()}")

    val circulo1 = Circulo(5.0)
    circulo1.tituloResultado()
    println("Perímetro del circulo: ${circulo1.calcularPerimetro()}")
    println("Superficie del circulo : ${circulo1.calcularSuperficie()}")

}