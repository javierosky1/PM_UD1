package elementos_basicos

fun main() {
    val customerName:String = "Claudia Martinez"

    println(customerName[5])
    println(customerName.get(5))
    for(char in customerName){
        print(char)
    }

    for (index in customerName.indices) {
        println(customerName[index])
    }

    println(customerName.length)

    // Concatenación
    val a = "José" + " Monteria"
    val b = "Cantidad de ahorros: " + 536.4
    val c = "Resultado: " + (2 + 4)

    var d = "Nueva concatenación"
    d += '!'

    // raw string
    val welcomeText = """
        |¡Bienvenido a la guía de Kotlin de develou.com!
        |En esta serie de tutoriales aprenderás 
        |los conceptos básicos sobre el lenguaje
        |y las herramientas necesarias para probarlo
    """.trimMargin()
    println(welcomeText)
}