package com.poo.classes;

public class Endereco {
private String uf;
private String cidade;
private String tipo;
private String logradouro;
private String complemento;
private int id_endereco;
private static int contador = 1 ;

//construtor
public Endereco(String uf , String cidade , String tipo , String logradouro , String complemento){

    this.uf = uf;
    this.cidade = cidade;
    this.tipo = tipo;
    this.logradouro = logradouro;
    this.complemento = complemento;
    this.id_endereco = contador;
    contador ++ ;
}

public Endereco() {
    //TODO Auto-generated constructor stub
}

//metodos getters e setters
public String getUf(){
    return uf;
}
public void setUf(String nome){
    this.uf = nome;
}

public String getCidade(){
    return cidade;
}
public void setCidade(String cidade){
    this.cidade = cidade;
}

public String getTipo(){
    return tipo;
}
public void setTipo(String tipo){
    this.tipo = tipo;
}


public String getLogradouro(){
    return logradouro;
}
public void setLogradouro(String nome){
    this.logradouro = logradouro;
}


public String getComplemento(){
    return complemento;
}
public void setComplemento(String complemento){
    this.complemento = complemento;
}

//metdos de exibir informaçôes da pessoa
public void exibirInformacoes(){
    System.out.println("uf : " + getUf());
    System.out.println("cidade : " + getCidade());
    System.out.println("tipo : " + getTipo());
    System.out.println("logradouro: " + getLogradouro());
    System.out.println("complemento: " + getComplemento());
}
}
