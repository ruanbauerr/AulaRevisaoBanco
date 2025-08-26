package org.example.ui

fun menu(){
    println("1-Cadastrar Caixa D'Agua ")
    println("2-Editar Caixa D'Agua ")
    println("3-Listar Caixa D'Agua ")
    println("4-Excluir Caixa D'Agua ")

    val opcao= readln().toInt()
    when (opcao) {
        1 -> println("Cadastrando caixa...")
        2 -> println("Editando caixa...")
        3 -> println("Listar caixas...")
        4 -> println("Excluindo caixa...")
        else -> println("Opção invalida")
    }
}