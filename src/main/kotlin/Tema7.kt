package org.example


fun main() {

    println("Hola")

    var tacosServidos = 0
    while (tacosServidos < 5) {
        if (tacosServidos == 3) {
            tacosServidos += 1
            continue
        }
        println("Taco N. $tacosServidos Servido ...")
        tacosServidos += 1
    }

    val pais = "MX"

    when (pais) {
        "MX" -> println("Mexico")
        "EU" -> println("Europa")
        "US" -> println("USA")
        else -> println("NO RECONOCIDO")
    }

    // Ejemplo 1
    val nombres = listOf("Ivette", "Perla", "Juliette", "Jaime", "Ale")

    println(nombres[1])

    for (nombre in nombres) {
        if (nombre == "Jaime") {
            println("SE ENCONTRO")
        }
    }

    // Ejemplo 2
    val numeros = listOf(5, 3, 9, 10, 20)
    for (numero in numeros) {
        println(numero)
    }



}
