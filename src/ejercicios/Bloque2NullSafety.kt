package ejercicios

fun ejecutarBloque2() {
    println("--- BLOQUE 2: NULL SAFETY ---")

    // Ejercicio 6.
    var apodo: String? = null
    println("6. Apodo: $apodo")

    // Ejercicio 7.
    val mostrar = apodo ?: "Sin apodo"
    println("7. $mostrar")

    // Ejercicio 8.
    var texto: String? = "Kotlin"
    println("8. Longitud: ${texto?.length}")
    texto = null
    println("   Con null: ${texto?.length}")

    // Ejercicio 9.
    var correo: String? = "vale@mail.com"
    correo?.let {
        println("9. Enviando correo a $it")
    }
    correo = null
    correo?.let {
        println("   Esto no pasa")
    }

    // Ejercicio 10.
    var algo: String? = "Hola"
    println("10. ${algo!!.length} (cuidado con null)")
}