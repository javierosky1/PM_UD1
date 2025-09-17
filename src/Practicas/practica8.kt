package Practicas

fun main() {
    println("Introduce un número entero: ")
    val num = readLine()?.toInt() ?: 0

    for (i in 1..num){
        if (i == 20){
            break
        }else if (i % 3 == 0){
            continue
        }

        println(i)
    }
}