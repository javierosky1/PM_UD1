package Practicas

fun main() {

    var notes = DoubleArray(5)

    for (i in 0 ..< 5){
        print("Introduce el numero de la posición $i: ")

        val num: Double = readLine()?.toDouble() ?: 0.0

        notes[i] = num
    }

    for (i in notes.indices){
        println("Nota ${i + 1}: ${notes[i]}")
    }

    val combinedNotes = notes.sum()
    println("La suma de las notas es $combinedNotes")

    val averageNote = combinedNotes / notes.size
    println("Las media de las notas es $averageNote")

    var greatestNote = -1.0

    for (i in notes){
        if (i > greatestNote){
            greatestNote = i
        }
    }

    println("La nota más alta es $greatestNote")
}