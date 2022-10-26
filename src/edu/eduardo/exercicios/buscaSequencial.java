package edu.eduardo.exercicios;
import java.util.*;

public class buscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo(a) à busca sequencial!");

        System.out.println("Qual número deseja buscar?");
          int numero = leitor.nextInt();

        int pos = -1;
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] == numero){
              pos = i;
              System.out.println("Achei " + numero + " na posicao " + (pos));
              break;
            }
            if (i == 9 && elementos[i] != numero){
              System.out.println("Numero " + numero + " nao encontrado!");
            }
        }
        

    }
  }