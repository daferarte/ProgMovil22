package com.unimarsoft.primerkotlin

const val separador="==========="

fun main(){
    mostrarPersonas("pepito","pacho","chema")
    println(separador)
    mostrarPersonas("pepito","pacho","chema","dickens","ck")
}

fun mostrarPersonas(p1: String, p2: String, p3: String){
    println(p1)
    println(p2)
    println(p3)
}

fun mostrarPersonas(vararg personas: String){
    //println(personas[0])
    println("-----for-----")
    for(persona in personas) println(persona)
    println("-----while-----")
    var indice = 0
    while (indice < personas.size){
        println(personas[indice])
        indice++
    }
    println("-----when-----")
    indice = (0..personas.size-1).random()
    when(personas[indice]){
        "pacho" -> println("Es Pacho !!")
        "chema" -> println("Bien Chema !!")
        "pepito" -> {
            println("Hola estudiantes !!")
            println("y pepito")
        }
        else -> println(personas[indice])
    }
}