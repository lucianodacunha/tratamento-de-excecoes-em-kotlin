package net.lucianodacunha.exceptions

import kotlin.random.Random

class IllegalAgeException(message: String) : Exception()

fun portaria(idade: Int){
    if (idade < 18){
        throw IllegalAgeException("Idade informada: $idade, entrada não permitida!")
    }
    println("$idade")
    println("Bem vindx!")
}

fun main(){
    print("Entre com sua idade: ")
    val idade = Random.nextInt(30)
    portaria(idade)
}