package Practicas

import kotlin.math.pow
import kotlin.math.sqrt

class CalculadoraCientifica(a: Double, b: Double) : CalculadoraBase(a, b) {

    fun cuadrado() = a.pow(2)

    fun raizCuadrada() = sqrt(a)
}