package Practicas.practica23


fun main() {

}

// 2. Función de orden superior para filtrar tareas
fun filterTasks(tasks: List<Task>, criterio: (Task) -> Boolean): List<Task> {

    val filteredTasks = mutableListOf<Task>()

    for (task in tasks){
        if (criterio(task)){
            filteredTasks.add(task)
        }
    }

    // TODO: convertir resultado a list y devolverlo
}

