package org.example


fun main() {

    // Listas
    val frutasList = listOf("🍎", "🍐", "🍉", "🍌")
    val frutasMutableList = mutableListOf("🍎", "🍐", "🍉", "🍌")

    // Arreglos
    val frutasArray = arrayOf("🍎", "🍐", "🍉", "🍌")
    val frutasArrayList = arrayListOf("🍎", "🍐", "🍉", "🍌")

    // Sets
    val frutasSet = setOf("🍎", "🍐", "🍉", "🍌")
    val frutasHashSet = hashSetOf("🍎", "🍐", "🍉", "🍌")

    // Mapas
    val frutasMap = mapOf(
        "🍎" to 10,
        "🍐" to 5,
        "🍉" to 8,
        "🍌" to 3
    )
    val frutasHashMap = hashMapOf(
        "🍎" to "Manzana",
        "🍐" to "Pera",
        "🍉" to "Sandia",
        "🍌" to "Platano"
    )

    // Funciones con Listas
    println(frutasList.get(0))
    println(frutasList.indexOf("🍌"))
    println(frutasList.size)
    println(frutasList)
    frutasList.forEach { println(it) }



    // TODO: TAREA
    println(frutasMutableList)


    // TODO: TAREA
    println(frutasArray)

    // TODO: TAREA
    println(frutasArrayList)

    // TODO: TAREA
    println(frutasSet)

    // TODO: TAREA
    println(frutasHashSet)

    // TODO: TAREA
    println(frutasMap)

    // TODO: TAREA
    println(frutasHashMap)


}