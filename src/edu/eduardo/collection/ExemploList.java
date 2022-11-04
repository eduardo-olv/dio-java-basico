package edu.eduardo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ExemploList {
    public static void main(String[] args) {
        List <Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(10d);
        notas.add(1d);
        notas.add(5.5);
        notas.add(6.7);
        notas.add(5d);
        notas.add(7d);

        System.out.println(notas);
        System.out.println("Posição da nota 5: " +notas.indexOf(5d));

        notas.add(4, 8d);
        System.out.println(notas);

        notas.set(notas.indexOf(1d), 6d);
        System.out.println(notas);
        System.out.println("A nota 5 está na lista? " +notas.contains(5d));
        
        for (Double nota : notas) {
            System.out.println(nota);
        }

        Iterator<Double> iterator = notas.iterator(); 
        Double soma = 0d;  

        while (iterator.hasNext( )){
        Double next = iterator.next( );
        soma += next;
    }
    System.out.println(soma);

    }
    

}
