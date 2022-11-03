package com.unimarsoft.primerkotlin

fun main(){
    decirHola()

    NMensaje("Suma")
    var a =5
    var b: Int = 2
    println("El resultado de la suma de $a + $b = ${sumar(a, b)}")
    println("El resultado de la resta es $a - $b = ${sub(a, b)}")
}

private fun decirHola(): Unit {
    println("hola")
}

fun sumar(num1: Int, num2: Int):Int{
    return num1+num2
}

fun sub(num1: Int, num2: Int) = num1-num2
