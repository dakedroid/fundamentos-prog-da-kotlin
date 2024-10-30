package org.example

fun main (){

    println("Bievenido")

    val estatura = readln().toInt()

    if(estatura <= 150 )
        println("Eres chaparro")
    else if (estatura > 150 && estatura <= 170)
        println("Eres estatura promedio")
    else if (estatura > 170)
        println("Estas muy alto")
    else
        println("Estatura icorrecta")

    /**
    # Realizar un programa que pida la calificación final de fund. de programación
    # Considere el escenario donde 'esta reprobado': 0 < cal < 69
    # 'Alcanzo el minimo para pasar': cal == 70
    # 'Aprobo excelente mente': cal == 100
    # Imprima que paso en todos los casos 'Aprobo': 70 < cal < 100
    # En un caso no contemplado: valor no valido.
     * **/


}