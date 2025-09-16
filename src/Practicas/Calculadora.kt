package Practicas

class Calculadora {
    // Suma
    fun sumar(a: Int, b: Int): Int {
        return a + b
    }

    fun restar(a: Int, b: Int): Int {
        return a - b
    }

    fun multiplicar(a: Int, b: Int): Int {
        return a * b
    }

    fun dividir(a: Int, b: Int): Double {
        if (b == 0){
            throw IllegalArgumentException("No se puede dividir entre 0")
        }

        return a.toDouble() / b.toDouble()
    }
}
