package net.lucianodacunha.exceptions

/**
 * Em Kotlin, throw é uma expressão que retorna o tipo Nothing.
 */

fun main(){
    println(returnNothing("Kotlin"))
}

fun returnNothing(value: String? = null): String?{
    value ?: throw Exception("Valor requerido")
    return value
}