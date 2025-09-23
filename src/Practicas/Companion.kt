package Practicas

class Contador {

    companion object {
        var contador: Int = 0

        fun imprimirValor() {
            println("El valor actual del contador es: " + this.contador)
        }
    }

    fun aumentarContador() {
        contador++
    }
}