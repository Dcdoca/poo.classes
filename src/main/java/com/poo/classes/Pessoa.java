package com.poo.classes;

public abstract class  Pessoa {
private String rg;
private String cpf;
private String nome;
private String endereco;
private int id_pessoa;
private static int contador = 1 ;

//construtor
public Pessoa(String nome , String rg , String cpf , String endereco){

    this.nome = nome;
    this.rg = rg;
    this.cpf = cpf;
    this.endereco = endereco;
    this.id_pessoa = contador;
    contador ++ ;
}



public Pessoa(String nome2, String cpf2, String rg2) {
    //TODO Auto-generated constructor stub
}



//metodos getters e setters
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public String getRg(){
    return rg;
}
public void setRg(String rg){
    this.rg = rg;
}
public String getCpf(){
    return cpf;
}
public void setCpf(String cpf){
    this.cpf = cpf;
}
public String getEndereco(){
    return endereco;
}
public void setEndereco(String endereco){
    this.endereco = endereco;
}

//metdos de exibir informaçôes da pessoa
public void exibirInformacoes(){
    System.out.println("rg: " + getRg());
    System.out.println("cpf: " + getCpf());
    System.out.println("nome: " + getNome());
    System.out.println("endereco: " + getEndereco());
}

}

