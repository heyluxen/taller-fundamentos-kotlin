package ejercicios

fun ejecutarBloque6() {
    println("--- BLOQUE 6: COLECCIONES ---")

    // Ejercicio 26.
    val compras = mutableListOf("Pan", "Leche", "Huevos")
    println("26. $compras")
    compras.add("Queso")
    compras.removeAt(1)
    println("    Después: $compras")

    // Ejercicio 27.
    val precios = listOf(100.0, 45.0, 30.0, 80.0, 20.0)
    val baratos = precios.filter { it < 50 }
    println("27. Precios: $precios")
    println("    Menores a 50: $baratos")

    // Ejercicio 28.
    val amigos = listOf("Pedro", "Ana", "Luis", "Alberto")
    val encontrado = amigos.find { it.startsWith('A') }
    println("28. $amigos")
    println("    Primero con A: $encontrado")

    // Ejercicio 29.
    println("29. -3 es negativo? ${(-3).esNegativo()}")
    println("     5 es negativo? ${5.esNegativo()}")

    // Ejercicio 30.
    val frase = "Hola mundo esto es Kotlin"
    println("30. '$frase'")
    println("    Sin espacios: '${frase.quitarEspacios()}'")
}

fun Int.esNegativo(): Boolean = this < 0

fun String.quitarEspacios(): String = this.replace(" ", "")