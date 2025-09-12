package Practicas

fun main() {
    print("Introduce una cadena de texto: ");
    var text = readLine() ?: ""
    print("Introduce una posición de la cadena: ")
    var strNumber = readLine() ?: "0"
    var number: Int = strNumber.toInt() - 1


    if (number >=0 && number < text.length) {

        println("Caracter de la posición: ${text[number]}")

        if (number > 0) {
            println("Caracter anterior: ${text[number - 1]}")
        }else{
            println("No hay caracter anterior")
        }

        if (number < text.length - 1) {
            println("Caracter siguiente: ${text[number + 1]}")
        }else{
            println("No hay caracter siguiente")
        }
    }else{
        print("La posición de la cadena es inválida")
    }

}