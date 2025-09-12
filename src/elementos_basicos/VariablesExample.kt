package elementos_basicos

fun main() {
    // 1. Variables inmutables
    val xPos: Int = 1
    val yPos: Int
    yPos = 5

    println("Coordenada actual del jugador: ($xPos, $yPos)")

    // 2. Variables mutables
    var xPosMut: Int = 1
    val yPosMut: Int = 5

    xPosMut = 2

    println("Coordenada actual del jugador: ($xPosMut, $yPosMut)")

    // 3. Entrada y salida de flujo
    print("Ponle un nombre a tu personaje: ")
    val pjName = readLine()

    print("Bienvenido $pjName")
}