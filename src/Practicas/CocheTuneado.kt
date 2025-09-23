package Practicas

class CocheTuneado constructor(marca: String, modelo: String) {

    val marca: String = marca
        get() = field.uppercase()

    val modelo: String = modelo
        get() = field.uppercase()

    var velocidad: Int = 0
        private set(velocidad) {
            if (velocidad < 0) {
                field = 0
            } else {
                field = velocidad
            }
        }

    constructor(marca: String, modelo: String, velocidad: Int) : this(marca, modelo) {
        this.velocidad = velocidad
    }

    fun acelerar(cantidad: Int) {
        this.velocidad += cantidad
    }

    fun frenar(cantidad: Int) {
        this.velocidad -= cantidad
    }
}