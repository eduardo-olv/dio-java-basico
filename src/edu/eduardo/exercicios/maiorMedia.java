package edu.eduardo.exercicios;

import java.util.Scanner;

public class maiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int media = 0;
        

       do{
        System.out.println("Insira um Número:" );
        numero = scan.nextInt();
            if (numero > maior) maior = numero;
        
        media = media + numero;
        count++;
       }while (count < 5);

       media = media / count;
       

       System.out.println("Maior: " +maior);
       System.out.println("A Média é: " +media);

    
        
     
    }
}
