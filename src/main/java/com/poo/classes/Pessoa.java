package com.poo.classes;

public class Pessoa {
private String rg;
private String cpf;
private String nome;
private String endereco;



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
