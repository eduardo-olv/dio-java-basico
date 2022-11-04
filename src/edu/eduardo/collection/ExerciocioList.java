package edu.eduardo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciocioList {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        List<Double> temperaturas = new ArrayList<>();

        List<String> meses = new ArrayList<>(){{
            add("Janeiro");
            add("Fevereiro");
            add("Março");
            add("Abril");
            add("Maio");
            add("Junho");
        }};

    System.out.println("Digite as temperaturas: ");
       double count = 0;
    while (count < 6){
        temperaturas.add(leitor.nextDouble());
        count++;
    }

    Iterator<Double> iterator = temperaturas.iterator(); 
    double soma = 0;
    while (iterator.hasNext()){
        double next = iterator.next();
        soma += next;
    }
    leitor.close();

    System.out.println("Essas foram as temperaturas em cada mês: ");
    System.out.println(meses.get(0) +" "+ temperaturas.get(0)+ " ºC");
    System.out.println(meses.get(1) +" "+ temperaturas.get(1)+ " ºC");
    System.out.println(meses.get(2) +" "+ temperaturas.get(2)+ " ºC");
    System.out.println(meses.get(3) +" "+ temperaturas.get(3)+ " ºC");
    System.out.println(meses.get(4) +" "+ temperaturas.get(4)+ " ºC");
    System.out.println(meses.get(5) +" "+ temperaturas.get(5)+ " ºC");

    

    System.out.printf("A média semestral de temperatura é: %.1f ºC",  (soma/temperaturas.size()));
    
    Thread.dumpStack();

   

    }
}