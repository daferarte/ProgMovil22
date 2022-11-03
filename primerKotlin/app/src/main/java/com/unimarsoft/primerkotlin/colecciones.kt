package com.unimarsoft.primerkotlin

fun main(){
    val frutaList = listOf("Manzana", "Banana", "Uva","Lima")
    println(frutaList.get((0..frutaList.size-1).random()))
    println("Index de Banana es ${frutaList.indexOf("Banana")}")

    println("Lista mutable")

    val myUsuario=Usuario(0,"Daniel F.", "Arteaga F.", Grupo.Familia.ordinal)
    val hermano = myUsuario.copy(1, "Ivan")
    val amigo = hermano.copy(2, grupo = Grupo.Amigos.ordinal)

    val listaUsuarios = mutableListOf(myUsuario, hermano)
    println(listaUsuarios)
    listaUsuarios.add(amigo)
    println(listaUsuarios)
    listaUsuarios.removeAt(1)
    println(listaUsuarios)
    listaUsuarios.remove(amigo)
    println(listaUsuarios)

    val usuariosSeleccionadosLista = mutableListOf<Usuario>()
    usuariosSeleccionadosLista.addAll(listaUsuarios)
    println(usuariosSeleccionadosLista)

    println("mapas mutables")
    val mapaUsuarios = mutableMapOf<Int, Usuario>()
    println(mapaUsuarios)
    mapaUsuarios.put(myUsuario.id.toInt(),myUsuario)
    mapaUsuarios.put(hermano.id.toInt(),hermano)
    println(mapaUsuarios.keys)
    println(mapaUsuarios.values)
    mapaUsuarios.remove(0)
    mapaUsuarios.remove(1)
    if(!mapaUsuarios.isEmpty()){
        println(mapaUsuarios)
    }else{
        println("No hay datos")
    }
}