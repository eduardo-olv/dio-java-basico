package edu.eduardo.exercicios;

import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[20];

        for(int i = 0; i < numeros.length; i++){
            int aleatorio = random.nextInt(20);
            
            if (aleatorio != 0)
            numeros[i] = aleatorio; else{
                i--;
            }
            

        }

        System.out.println("Números Aleatórios: ");
        for (int aleatorio : numeros) {
            System.out.println(aleatorio);
        }
        
    }
}
