package Practicas.practica22

class Inventario {

    val products = mutableMapOf<String, Producto>()

    fun agregarProducto(id: String, producto: Producto) {
        products[id] = producto
    }

    fun actualizarPrecio(id: String, nuevoPrecio: Double) {
        products[id]?.precio = nuevoPrecio
    }

    fun eliminarProducto(id: String) {
        products.remove(id)
    }

    fun mostrarProductos() {
        if (!products.isEmpty()) {
            for ((_, producto) in products){
                println("Nombre del producto: ${producto.nombre}, precio: ${producto.precio}")
            }
        } else {
            println("El inventario está vacio")
        }
    }

    fun buscarProductoPorId(id: String): Producto? {
        val product = products[id]

        if (product != null){
            println("Nombre: ${product.nombre}, precio: ${product.precio}")
        } else {
            println("No se ha encontrado el producto")
        }

        return product
    }

}