package edu.eduardo.exercicios;

import java.util.Scanner;

public class ExOperacoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
       double numeroUm = scan.nextDouble();

        System.out.println("Digite o segundo número: ");
       double numeroDois = scan.nextDouble();

       somar(numeroUm, numeroDois);
       subtrair(numeroUm, numeroDois);
       multiplicar(numeroUm, numeroDois);
       dividir(numeroUm, numeroDois);
       scan.close();
    }


    public static void somar(double numeroUm, double numeroDois) {
        double resultado = numeroUm + numeroDois;
        System.out.println("A soma de " +numeroUm +" + " +numeroDois +" = " +resultado);
    }

    public static void subtrair(double numeroUm, double numeroDois) {
        double resultado = numeroUm - numeroDois;
        System.out.println("A subtração de " +numeroUm +" - " +numeroDois +" = " +resultado);
    }

    public static void multiplicar(double numeroUm, double numeroDois) {
        double resultado = numeroUm * numeroDois;
        System.out.println("A multiplicação de " +numeroUm +" X " +numeroDois +" = " +resultado);
    }

    public static void dividir(double numeroUm, double numeroDois) {
        double resultado = numeroUm / numeroDois;
        System.out.println("A divisão de " +numeroUm +" / " +numeroDois +" = " +resultado);
    }
}
