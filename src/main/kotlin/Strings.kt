package org.example

fun main (){

    val nombre = "Hola Mundo desde Tec Mina"

    println(nombre[0])
    print(nombre[8])
    println(nombre.get(9))

    println(nombre.length)
    println(nombre.uppercase())
    println(nombre.lowercase())
    println(nombre.indexOf("Tec"))

    var primerNombre = "Kevin"
    var apellido  = "Molina"

    println(primerNombre.uppercase() + " " +  apellido)

    println("Tu nombres : ${primerNombre.uppercase()} $apellido")




}