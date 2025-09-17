package control_flujo

fun main() {
    val year = 2010
    when (year) {
        2010 -> println("Froyo")
        2011 -> println("Ice Cream Sandwitch")
        2008, 2009 -> print("The Early Days")
        in 2012..2015 -> {
            println("JellyBean through Marshmallow")
            println("When things got interesting")
        }
        else -> println("Other era")
    }

    val formResponse : Any = 12

    when (formResponse){
        is Int -> println("Respuesta Entera")
        is String -> println("Respuesta String")
    }

    val markNumber = 4

    val markText = when (markNumber) {
        1 -> "Insuficiente"
        2 -> "Deficiente"
        3 -> "Aceptable"
        4 -> "Sobresaliente"
        5 -> "Excelente"
        else -> "No permitido"
    }

    println("La calificación es $markText")
}