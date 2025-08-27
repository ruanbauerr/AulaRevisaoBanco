package org.example.crud

import org.example.entidades.CaixaDAgua
import org.example.enumeradores.Cor
import org.example.enumeradores.Material

fun cadastrarCaixa(){
    /*




    * */
    println("Escolha o material do qual a caixa é composta:")
    println("1- PVC")
    println("2-Tijolo")
    println("3-Fibra")
    val opcao = readln().toInt()
    var material : Material
    when (opcao) {
        1-> material = Material.PVC
        2-> material = Material.TIJOLO
        3-> material = Material.FIBRA
        else-> material = Material.FIBRA
    }
    println("escolha a cor da caixa:")
    println("1- AZUL")
    println("2- CINZA")
    println("3- AMARELO")
    println("4- PRETO")
    val opcaoCor = readln().toInt()
    var cor : Cor
    when (opcaoCor) {
        1-> cor = Cor.AZUL
        2-> cor = Cor.CINZA
        3-> cor = Cor.AMARELO
        4-> cor = Cor.PRETO
        else -> cor = Cor.AZUL
    }
    println("Digite a capacidade da caixa em litros:")
    val capacidade = readln().toDouble()
    println("Digite a Altura:")
    val altura = readln().toDouble()
    println("Digite a Largura: ")
    val largura = readln().toDouble()
    println("Digite a Profundidade: ")
    val profundidade = readln().toInt()

    //salvar as variaveis agora dentro da classe
    CaixaDAgua(
        material = material,
        cor = cor,
        capacidade = capacidade,
        altura = altura,
        largura = largura,
        profundidade = profundidade,

    )

}
fun editarCaixa(){

}
fun listarCaixas(){

}
fun excluirCaixa(){

}