package org.example


class Salon {

    // Variables Globales
    val clima = "MIRAGE"
    val pizzarron = "BLANCO"
    var proyector = "EPSON"
    var maestro = ""

    fun disenar(){
        println("Estoy diseñando")
    }

    fun mandarMsjs(){
        println("Estoy mandando msjs")
        println("no sirve el proyector $proyector")
    }

    fun reproducirVideo(){
        // variable local
        val link = "https://www.youtube.com/watch?v=V9PVRfjEBTI"
        println("Estoy reproduciendo $link en el proyector $proyector")
    }

    fun almacenarBaseDatos(){
        println("Estoy almacenando")
    }


    fun configurar(){
        println("Estoy configurando")

    }

}



fun main() {
    // Menú del restaurante con precios
    val menu = mapOf(
        "Hamburguesa" to 50.0,
        "Pizza" to 80.0,
        "Ensalada" to 30.0,
        "Refresco" to 15.0,
        "Agua" to 10.0
    )

    // Lista para almacenar el pedido del cliente
    val pedido = mutableListOf<String>()
    var total = 0.0
    var opcion: String

    println("¡Bienvenido al restaurante!")

    // Ciclo para agregar productos al pedido
    do {
        // Mostrar el menú
        println("\nMenú:")
        for ((producto, precio) in menu) {
            println("$producto: $$precio")
        }

        // Solicitar al usuario que ingrese su selección
        println("\n¿Qué te gustaría ordenar? (Escribe 'fin' para terminar el pedido)")
        opcion = readLine()?.capitalize() ?: ""

        // Verificar si la opción está en el menú
        if (menu.containsKey(opcion)) {
            pedido.add(opcion)
            total += menu[opcion]!!
            println("$opcion agregado a tu pedido.")
        } else if (opcion != "Fin") {
            println("El producto no está en el menú, intenta de nuevo.")
        }

    } while (opcion != "Fin")

    // Mostrar el resumen del pedido
    if (pedido.isNotEmpty()) {
        println("\nTu pedido es:")
        for (producto in pedido) {
            println("- $producto")
        }

        // Aplicar descuento si el total supera 150
        if (total > 150) {
            val descuento = total * 0.1  // 10% de descuento
            total -= descuento
            println("\nDescuento aplicado: -$$descuento")
        }

        // Mostrar el total a pagar
        println("Total a pagar: $$total")
    } else {
        println("\nNo se ordenó nada.")
    }

    println("\n¡Gracias por tu visita!")
}
