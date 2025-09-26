package Practicas.practica21

class GestorUsuarios {

    private val usuarios: MutableList<Usuario> = mutableListOf()

    fun agregarUsuario(user: Usuario){

        if (usuarios.any{it.email == user.email}) {
            println("El correo del usuario ya está en uso")
        } else {
            usuarios.add(user)
            println("Usuario agregado")
        }
    }

    fun mostrarUsuarios() {
        if (usuarios.size > 0){
            usuarios.forEach { println("Nombre de usuario: ${it.username}, correo: ${it.email}") }
        } else {
            println("No hay usuarios en la lista")
        }
    }

    fun buscarUsuarioPorEmail(email: String): Usuario? {
        val foundUser = usuarios.find { it.email == email }

        if (foundUser != null){
            println("Usuario encontrado")
        } else {
            println("No se ha encontrado al usuario")
        }

        return foundUser
    }

}