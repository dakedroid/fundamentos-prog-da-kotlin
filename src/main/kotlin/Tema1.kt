package org.example

fun main() {
    // imprimir un String (cadena de texto)
    // Imprimir un Int y Long (numero entero)
    // Imprimir Float y Double
    println(10)
    println("Hola Mundo")
    println(-2)
    println("Adios Mundo")
    println(2.0)
    println(100.530212)
    println(2 + (4 * 2))

    // Variables
    var x = 5
    println(x + x)
    var y = "Saludos"
    x = 3
    println(x + (6 / 2))
    val z = "Mecanico"
    println(y + "Juan" + z)
    println(z + " " + x)

    // Calcular el area de un rectangulo
    // Largo * ancho
    var largo = 5
    var ancho = 3
    val area = largo * ancho
    println("El area es: " + area)

    // TAREA EL DE 3 CALIFICACIONES Y PEDIR PROMEDIO

    // CALCULAR SALARIOS EXTRA **


    val cal_1 = readln().toInt()
    val cal_2 = readln().toInt()
    val cal_3 = readln().toInt()

    val suma = cal_1 + cal_2 + cal_3
    val promedio = suma / 3

    println("El promedio es: $promedio")
}
