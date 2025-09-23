package Practicas

fun main() {
    Contador.contador++
    Contador.contador++
    Contador.contador++
    Contador.contador++
    Contador.imprimirValor()

    val counter = Contador()
    counter.aumentarContador()
    Contador.imprimirValor()
}