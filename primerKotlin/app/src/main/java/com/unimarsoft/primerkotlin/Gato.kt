package com.unimarsoft.primerkotlin

class Gato {
    var nombre:String =""
    var color:String=""
    var raza:String=""

    constructor(nombre:String, color:String, raza:String){
        this.nombre=nombre
        this.color=color
        this.raza=raza
    }

    fun getNombre(){
        println(this.nombre)
    }

    fun getColor(){
        println(this.color)
    }

    fun getRaza(){
        println(this.raza)
    }

}

fun main(){
    val gato = Gato("michin", "amarillo", "angora")
    gato.getNombre()
}