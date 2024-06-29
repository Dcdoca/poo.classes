package com.poo.classes;

public class Classe {

}
String cpfNumerico = CPF.replaceAll("\D", "");
        if ((cpfNumerico.length())==11) {

            this.CPF=CPF;
        }
public void setRG (String RG) {
        String rgNumerico = RG.replaceAll("\D", "");
        if ((rgNumerico.length())==9) {

            this.RG=RG;
        }
    }
