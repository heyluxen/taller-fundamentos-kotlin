package ejercicios

fun ejecutarBloque3() {
    println("--- BLOQUE 3: CONDICIONALES ---")

    // Ejercicio 11.
    val edad = 17
    if (edad >= 18) {
        println("11. Puede votar")
    } else {
        println("11. No puede votar")
    }

    // Ejercicio 12.
    val nota = 55
    val estado = if (nota >= 60) "Aprobado" else "Reprobado"
    println("12. Nota $nota → $estado")

    // Ejercicio 13.
    val color = "Amarillo"
    val accion = when (color) {
        "Rojo" -> "Pare"
        "Amarillo" -> "Precaución"
        "Verde" -> "Siga"
        else -> "?"
    }
    println("13. $color → $accion")

    // Ejercicio 14.
    val temp = 10
    val clima = when (temp) {
        in -50..14 -> "Frío"
        in 15..25 -> "Templado"
        else -> "Calor"
    }
    println("14. $temp grados → $clima")

    // Ejercicio 15.
    val algo: Any = "Soy un texto"
    val tipo = when (algo) {
        is String -> "Es String"
        is Int -> "Es Int"
        else -> "Otro"
    }
    println("15. $algo → $tipo")
}