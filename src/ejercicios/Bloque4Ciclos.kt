package ejercicios

fun ejecutarBloque4() {
    println("--- BLOQUE 4: CICLOS ---")

    // Ejercicio 16.
    print("16. ")
    for (i in 1..10) {
        print("$i ")
    }
    println()

    // Ejercicio 17.
    print("17. ")
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    // Ejercicio 18.
    print("18. ")
    for (i in 1..20 step 3) {
        print("$i ")
    }
    println()

    // Ejercicio 19.
    var energia = 5
    println("19. Energía: $energia")
    while (energia > 0) {
        energia--
        println("   Queda $energia")
    }

    // Ejercicio 20.
    val clave = "1234"
    var intento: String
    var contador = 0
    do {
        val opciones = listOf("1111", "2222", "1234")
        intento = opciones[contador]
        println("20. Probando: $intento")
        contador++
    } while (intento != clave && contador < 3)
    if (intento == clave) println("   Acceso concedido")
}