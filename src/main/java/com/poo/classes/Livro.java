package com.poo.classes;

public class Livro {
private String edicao;
private String titulo;
private int ano;

//metodos getters e setters

public String getEdicao(){
    return edicao;
}
public void setEdicao(String edicao){
    this.edicao = edicao;
}
public String getTitulo(){
    return titulo;
}
public void setTitulo(String titulo){
    this.titulo = titulo;
}
public int getAno(){
    return ano;
}
public void setAno(int ano){
    this.ano = ano;
}

//metdos de exibir informaçôes do livro
public void exibirInformacoes(){
    System.out.println("rg: " + getEdicao());
    System.out.println("cpf: " + getTitulo());
    System.out.println("nome: " + getAno());
}


}
