package Practicas

fun main() {
    val calculadora = CalculadoraCuerpoExpresion()

    print("Introduce tu nombre: ")
    val name = readLine() ?: "Desconocido"
    calculadora.saludar(name)

    print("Introduce el primer número: ")
    val num1 = readLine()?.toInt() ?: 0
    print("Introduce el segundo número: ")
    val num2 = readLine()?.toInt() ?: 0

    println("Suma = " + calculadora.sumar(num1, num2))
    println("Resta = " + calculadora.restar(num1, num2))
    println("Multiplicación = " + calculadora.multiplicar(num1, num2))
    println("División = " + calculadora.dividir(num1, num2))
}