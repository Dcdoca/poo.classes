package com.poo.classes;

public class Editora {
String nome;
private int id_editora;
private static int contador = 1 ;

//construtor
public Editora(String nome ){

    this.nome = nome;
    this.id_editora = contador;
    contador ++ ;
}

//metodos getters e setters
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}

//metdos de exibir informaçôes da pessoa
public void exibirInformacoes(){
    System.out.println("nome: " + getNome());
}
}
