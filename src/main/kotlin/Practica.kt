package org.example

fun main() {

    val entero = 5            // Int
    val doble = 5.99         // Double
    val letra = 'D'         // Char
    val boleano = true     // Boolean
    val cadena = "Hello"  // String

    val nombre = readln()
    println(nombre)

    val anioNacimiento = readln().toInt()
    println(2024 - anioNacimiento)


    // Operadores Aritmeticos
    println(2 + 2)
    println(4 - 2)
    println(6 * 2)
    println(10 / 2)

    // Operadores de Asignación
    var x = 5
    x = 3
    x += 1
    x -= 2
    x *= 2

    println(x)


    // Boleanos , Bool


    // Operadores de Comparación
    println(8 > 4)
    println(4 >= 6)
    println(20 < 30)
    println(10 <= 20)
    println(2 == 2)
    println(8 != 10)

    // Operadores Logicos -> AND (&&), OR (||), NOT (!)
    val permisoSalir = true
    val tengoDinero = true

    println(permisoSalir && tengoDinero)

    val hayDeAsada = true
    val hayDePastor = false

    println(hayDeAsada || hayDePastor)

    val lefueInfiel = true
    println(!lefueInfiel)

}




