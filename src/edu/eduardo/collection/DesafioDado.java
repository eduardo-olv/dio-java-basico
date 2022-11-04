package edu.eduardo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class DesafioDado {
    static Random dado = new Random();
    public static void main(String[] args) {
        
        
        List<Integer> resultados = new ArrayList<>();


        int count = 0;

        while (count < 100) {
            resultados.add(D6());
            count++;
        }

        Iterator<Integer> i = resultados.iterator();
        int zero = 0;
        int um = 0;
        int dois = 0;
        int tres = 0;
        int quatro = 0;
        int cinco = 0;
        int seis = 0;

        while (i.hasNext()) {
            switch (i.next()) {
                case 0:
                    
                    zero++;
                    break;
                case 1:

                    um++;
                    break;
                case 2:

                    dois++;
                    break;

                case 3:

                    tres++;
                    break;

                case 4:

                    quatro++;
                    break;

                case 5:

                    cinco++;
                    break;

                case 6:

                    seis++;
                    break;
            
                default:
                    break;
            }
        }
        
        System.out.println("O número 0 apareceu " +zero + " vezes.");
        System.out.println("O número 1 apareceu " +um + " vezes.");
        System.out.println("O número 2 apareceu " +dois + " vezes.");
        System.out.println("O número 3 apareceu " +tres + " vezes.");
        System.out.println("O número 4 apareceu " +quatro + " vezes.");
        System.out.println("O número 5 apareceu " +cinco + " vezes.");
        System.out.println("O número 6 apareceu " +seis + " vezes.");
        System.out.println("-----------------------------------");

    System.out.println(resultados);
        
    }

    public static int D6(){
        int resultado = 0;

        while (resultado == 0) {
            resultado = dado.nextInt(7);
        }
       
        
        return resultado;
    }

    


    
    
}
