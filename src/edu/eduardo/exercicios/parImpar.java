package edu.eduardo.exercicios;


import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int count = 0;
        int numero;
        int quantPares = 0, quantImpares = 0;
        

        System.out.println("Quantos números deseja inserir?");
        quantNumeros = scan.nextInt();
        
        do{
            System.out.println("Insira um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;

        }while(count < quantNumeros);

        System.out.println("Números pares: " + quantPares);
        System.out.println("Números ímpares: " + quantImpares);
    }
    
}
