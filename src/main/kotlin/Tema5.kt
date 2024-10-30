package org.example


fun main() {

    val numeros = arrayOf(1, 2, 3, 4, 5, 6)
    val numeros2 = listOf(1, 2, 3, 4, 5, 6)
    val numeros3 = mutableListOf(1, 2, 3, 4, 5, 6)
    val numeros4 = setOf(1, 2, 3, 4, 5, 6)
    val numeros5 = arrayListOf(1, 2, 3, 4, 5, 6)
    val numeros6 = mapOf(1 to "one", 2 to "two", 3 to "three")

    val frutas = arrayOf("🍎", "🍐", "🍉", "🍌")
    val frutas2 = setOf("🍎", "🍐", "🍉", "🍌", "🍌")

    val nombres = mapOf(
        24230791 to "Axel",
        24230792 to "Jaime",
        24230793 to "Iveth",
        24230794 to "July",
        24230795 to "Perla",
        24230796 to "Marco",
        14350241 to "Kevin"
    )

    val edades = mapOf(
        18 to 5,
        19 to 1,
        27 to 1
    )

    val generos = mapOf(
        "M" to "Masculino",
        "F" to "Femenino",
        "O" to "Otro"
    )

    val nombres2 = hashMapOf(
        24230791 to "Axel",
        24230791 to "Jaime",
        24230791 to "Iveth",
        24230791 to "July",
        24230791 to "Perla",
        24230791 to "Marco",
        14350241 to "Kevin"
    )



    println(numeros[0])

    frutas2.forEach { fruta ->
        println(fruta)
    }
}