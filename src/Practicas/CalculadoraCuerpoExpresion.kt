package Practicas

class CalculadoraCuerpoExpresion {

    fun sumar(a: Int?, b: Int?): Int {
        return (a ?: 0) + (b ?: 0)
    }

    fun restar(a: Int?, b: Int?): Int = (a ?: 0) - (b ?: 0)

    fun multiplicar(a: Int?, b: Int?): Int = (a ?: 0) * (b ?: 0)

    fun dividir(a: Int?, b: Int?): Int =
        if (b != 0) (a ?: 0) / (b ?: 0) else throw IllegalArgumentException("No se puede dividir entre 0")

    fun saludar(name: String, treat: String = "Doña") = println("Buenos días $treat $name")
}