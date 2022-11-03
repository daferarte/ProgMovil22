package com.unimarsoft.primerkotlin

class SmartPhone(number: Int,val isPrivate: Boolean) : Telefono(number) {
    override fun mostrarNumero(){
       if(isPrivate) println("Privado") else super.mostrarNumero()
    }
}

fun main(){
    val smartphone=SmartPhone(123455,true)
    smartphone.mostrarNumero()
    val smartphone2=SmartPhone(453534,false)
    smartphone2.mostrarNumero()
    smartphone2.llamada()

    val miUsuario=Usuario(0,"Daniel","Arteaga",Grupo.Familia.ordinal)
    println(miUsuario)
    println(miUsuario.component2())
    val hermano = miUsuario.copy(1,"Fernando")
    println(hermano)
    val friend = hermano.copy(id=2, grupo = Grupo.Amigos.ordinal)
    println(friend)
    println("---- Funciones de alcance -----")
    with(smartphone){
        println("Privado? $isPrivate")
        llamada()
    }

    friend.grupo = Grupo.Trabajo.ordinal
    friend.nombre = "Juan"
    friend.apellido = "Tellez"
    friend.apply {
        grupo=Grupo.Trabajo.ordinal
        nombre="Juan"
        apellido="Tellez"
    }
}