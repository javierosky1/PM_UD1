package Practicas

class Coche constructor(val marca: String, val modelo: String) {

    var velocidad: Int = 0
        private set(velocidad){
        field = velocidad
        if (field < 0){
            field = 0
        }
    }

    constructor(marca: String, modelo: String, velocidad: Int): this(marca, modelo) {
        this.velocidad = velocidad
    }

    fun acelerar(cantidad: Int){
        this.velocidad += cantidad
    }

    fun frenar(cantidad: Int){
        this.velocidad -= cantidad
    }
}