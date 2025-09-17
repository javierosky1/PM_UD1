package Practicas

fun main() {

    print("Introduce el peso: ")
    val weight = readLine()?.toFloat() ?: 0.0f
    print("Introduce la altura: ")
    val height = readLine()?.toFloat() ?: 0.0f

    val imc = weight / (height * height)

    when {
        imc < 18.5f -> println("Bajo peso")
        imc > 18.5f && imc < 24.9f -> println("Normal")
        imc > 25f && imc < 29.9f -> println("Sobrepeso")
        imc >= 30 -> println("Obesidad")
    }
}