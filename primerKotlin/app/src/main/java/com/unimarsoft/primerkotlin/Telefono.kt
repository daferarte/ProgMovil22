package com.unimarsoft.primerkotlin

open class Telefono (val number: Int){

    fun llamada(){
        println("Llamando")
    }

    open fun mostrarNumero(){
        println("Mi numero es: $number")
    }

}

fun main(){
    val telefono=Telefono(12345)
    telefono.mostrarNumero()
    telefono.llamada()
}