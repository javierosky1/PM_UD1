package elementos_basicos

fun main() {
    // 1. Tipos enteros
    val level: Byte = 50
    val healt: Short = 150
    val missionPoints: Int = 40000
    val experience: Long = 45121365412
    val monstersExecuted = 9990001522L

    // Literales binarios
    val bitmapLocation = 0b00100001
    val chestColor = 0xCCC

    println(bitmapLocation)
    println(chestColor)

    // 3. Tipos reales
    val attackSpeed: Float = 0.5f
    val dodgeChance: Double = 0.2

    // Literales reales
    val exp1 = 3.211e2
    val exp2 = .0001e10
    val exp3 = 48e5
    val exp4 = 10e-4

    println(exp1)
    println(exp2)
    println(exp3)
    println(exp4)

    println("Uno\nDos\nTres")
}