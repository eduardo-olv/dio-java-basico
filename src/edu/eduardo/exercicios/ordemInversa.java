package edu.eduardo.exercicios;

public class ordemInversa {
    public static void main(String[] args) {
        int[] vetor = {-5, -6, 15, 50, 8, 4};
        int count = 0;


        for (int i = (vetor.length-1); i >= 0; i--){
        System.out.println(vetor[i]);
        }
    }
}
