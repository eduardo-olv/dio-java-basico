package edu.eduardo.exemplo;
public class Boletim {
    
    public static void main (String [] args){
        int mediaFinal = 8;
        if(mediaFinal < 6)
            System.out.print("Reprovado");
        else if(mediaFinal == 6)
            System.out.print("Empate");
        else
            System.out.print("Aprovado");
    }


}
