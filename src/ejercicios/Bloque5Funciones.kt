package ejercicios

fun ejecutarBloque5() {
    println("--- BLOQUE 5: FUNCIONES ---")

    // Ejercicio 21.
    println("21. ${saludo("Valentina")}")

    // Ejercicio 22.
    println("22. 7 + 4 = ${suma(7, 4)}")

    // Ejercicio 23.
    println("23. Ancho 5, alto por defecto: ${rectangulo(5)}")
    println("    Ancho 5, alto 3: ${rectangulo(5, 3)}")

    // Ejercicio 24.
    println("24. Solo ancho: ${rectangulo(ancho = 8)}")

    // Ejercicio 25.
    println("25. 50 USD son ${conversor(50.0)} pesos")
}

fun saludo(nombre: String): String = "Hola $nombre"

fun suma(a: Int, b: Int): Int = a + b

fun rectangulo(ancho: Int, alto: Int = 10): String {
    return "Rectángulo ${ancho}x$alto"
}

fun conversor(dolares: Double): Double {
    return dolares * 3800
}