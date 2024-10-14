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

    println(frutasList.get(0))
    println(frutasList.indexOf("🍌"))
    println(frutasList.size)
    println(frutasList)




    println(frutasMutableList)



    println(frutasArray)
    println(frutasArrayList)

    println(frutasSet)
    println(frutasHashSet)

    println(frutasMap)
    println(frutasHashMap)


}