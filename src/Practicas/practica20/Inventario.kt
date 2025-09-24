package Practicas.practica20

class Inventario {
    private val productos: MutableSet<Producto> = mutableSetOf()
    fun agregarProducto(producto: Producto) {
        if (productos.add(producto)) {
            println("Producto añadido")
        } else {
            println("El producto ya existía en el inventario")
        }
    }

    fun mostrarProductos() {
        if (productos.isEmpty()){
            println("El inventario está vacío")
        } else {
            for ((name, cod) in productos){
                println("Nombre: $name, Código: $cod")
            }
        }
    }
}
