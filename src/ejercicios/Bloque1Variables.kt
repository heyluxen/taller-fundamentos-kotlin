package ejercicios

fun ejecutarBloque1() {
    println("--- BLOQUE 1: VARIABLES ---")

    //Ejercicio 1.
    val nombre = "Valentina"
    var ciudad = "Medellin"
    println("1. $nombre vive en $ciudad")
    ciudad = "Santa Marta"
    println("   Ahora vive en $ciudad")

    // Ejercicio 2.
    val nacimiento = 2008
    val actual = 2026
    val edad = actual - nacimiento
    println("2. Nací en $nacimiento, tengo $edad años")

    // Ejercicio 3.
    val precioAuto: Double = 35000.99
    val pesoNaranja: Float = 120.3f
    val poblacion: Long = 7900000000
    println("3. Auto: $$precioAuto, Naranja: ${pesoNaranja}g, Gente: $poblacion")

    // Ejercicio 4.
    val estaLloviendo = false
    println("4. ¿Está lloviendo? $estaLloviendo")

    // Ejercicio 5.
    println("5. Velocidad de la luz: ${Constantes.VELOCIDAD_LUZ} m/s")
}

object Constantes {
    const val VELOCIDAD_LUZ = 299792458
}