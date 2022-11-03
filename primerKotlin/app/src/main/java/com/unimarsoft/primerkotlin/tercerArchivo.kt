package com.unimarsoft.primerkotlin

import java.lang.Math.abs

fun main(){
    val c = -3
    println(c.enableAbs(true))

    ///// Sobrecarga /////
    mostrarProductos("papas",1500)
    mostrarProductos("empanadas",3000)
    mostrarProductos("Buñuelos",4000, "20%")
    mostrarProductos(producto = "Jugo", descuento = "30%")
}

infix fun Int.enableAbs(enable: Boolean) = if(enable) abs(this) else this

fun mostrarProductos(producto: String, precio: Int = 0, descuento:String = "0%"){
    println("El producto $producto vale $precio y tiene un descuento de $descuento")
}