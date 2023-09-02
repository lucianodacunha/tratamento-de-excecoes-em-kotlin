package net.lucianodacunha.exceptions

import java.lang.Exception
import java.util.Random

/**
 * Lançar exceções podem fazer sentido quando desejamos alertar o usuários
 * para uma entrada de dado de um tipo indesejado.
 */

fun main(){
//    val idade = Random()
//    exibeIdade(idade.nextInt(10) - 3)

    sintaxeExceptions()
}

fun exibeIdade(idade: Int){
    if (idade < 0){
        throw Exception("Informado: $idade: Idade inválida.")
    }

    println("Você tem $idade anos.")
}

// Estrutura da sintaxe de exceptions
fun sintaxeExceptions(){
    val randomValue = Random().nextInt(10)
    println("Valor aleatório: $randomValue")
    try {
        if(randomValue > 5){
            throw ArithmeticException("Erro específico")
        }
        if (randomValue < 5) {
            throw Exception("Erro genérico")
        }
        println("Nenhum erro encontrado.")
    } catch(e: ArithmeticException){
        println(e.message)
    } catch (e: Throwable){
        println(e.message)
    } finally {
        println("Trecho de código sempre executado.")
    }
}