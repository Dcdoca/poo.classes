package com.poo.classes;

public class Emprestimo {
    private int data_emprestimo;
    private int data_prev_dev ;
    private int id_emprestimo;
    private static int contador = 1 ;

    //construtor
    public Emprestimo(int data_emprestimo , int data_prev_dev){
        this.data_emprestimo = data_emprestimo;
        this.data_prev_dev = data_prev_dev ;
        this.id_emprestimo = contador;
        contador++;
    }
    //metodos getters e setters
public int getdata_Emprestimo(){
    return data_emprestimo;
}
public void setdata_Emprestimo(String nome){
    this.data_emprestimo = data_emprestimo;
}
//metodos getters e setters
public int getData_dev_prev(){
    return data_prev_dev;
}
public void setData_dev_prev(String nome){
    this.data_prev_dev = data_prev_dev;
}

//metdos de exibir informaçôes do Emprestimo
public void exibirInformacoes(){
    System.out.println(" A data do emprestimo foi: " + getdata_Emprestimo());
    System.out.println("A data de devoluçao prevista é: " + getData_dev_prev());
    
}



}
