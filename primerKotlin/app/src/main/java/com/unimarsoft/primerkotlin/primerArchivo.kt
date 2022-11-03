package com.unimarsoft.primerkotlin

fun main(){
    println("Hola mundo")
    NMensaje("Estudiantes")

    var a =2
    //var a = "hola"
    //var a = true
    var b: Int
    b=3
    println("el valor de b es $b")

    //////// tipo nulo ////////////

    var objNull: Any? //cualquier tipo de dato
    objNull = null

    //if(objNull != null) {
    //    println(objNull)


}

fun NMensaje(mensaje: String){
    println(mensaje)
}