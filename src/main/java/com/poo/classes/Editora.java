package com.poo.classes;

public class Editora {
String nome;

//construtor
public Editora(String nome ){

    this.nome = nome;
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
