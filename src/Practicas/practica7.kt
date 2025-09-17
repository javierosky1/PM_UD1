package Practicas

fun main() {
    println("Introduce 4 notas:")

    val notes = arrayOfNulls<Int>(4)

    for(i in 0 until 4){
        print("Nota ${i+1}: ")
        notes[i] = readLine()?.toInt() ?: 0
    }

    var average = 0

    for (i in 0 until notes.size){
        average += notes[i] ?: 0
    }

    average /= notes.size

    when {
        average >= 7 -> println("Notable")
        average in 5 until 7 -> println("Aprobado")
        average < 5 -> {
            print("Te presentaste a la recuperación? ")
            val response = readLine() ?: "N"
            when (response.uppercase()){
                "S" -> println("En recuperación")
                "N" -> println("Suspenso")
            }
        }
    }

}