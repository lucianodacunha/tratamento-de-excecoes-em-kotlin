package net.lucianodacunha.exceptions

/**
 * Demonstra a atribuição de um try/catch para uma variável.
 */
fun main() {
    exemple2()
}

fun exemple1(){
    print("Entre com um valor: ")
    val input = readln()
    val a: Int? = try {
        input.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun exemple2(){
    print("Entre com o valor do dividendo: ")
    val div1 = readln().toInt()
    print("Entre com o valor do divisor: ")
    val div2 = readln().toInt()
    var result = 0

    result = try {
        (div1 / div2)
    } catch (e: Exception){
        -1
    }

    println(result)
}