package Practicas

class CalculadoraNullable {
    // Suma
    fun sumar(a: Int?, b: Int?): Int {
        return (a ?: 0) + (b ?: 0)
    }

    fun restar(a: Int?, b: Int?): Int {
        return (a ?: 0) - (b ?: 0)
    }

    fun multiplicar(a: Int?, b: Int?): Int {
        return (a ?: 0) * (b?: 0)
    }

    fun dividir(a: Int?, b: Int?): Double {
        if (b == 0){
            throw IllegalArgumentException("No se puede dividir entre 0")
        }

        return (a?.toDouble() ?: 0.0) / (b?.toDouble() ?: 0.0)
    }
}