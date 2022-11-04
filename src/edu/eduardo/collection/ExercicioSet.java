package edu.eduardo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet{
    public static void main(String[] args) {
        System.out.println("Cores do Arco-Iris");

        Set<String> coresArcoIris = new LinkedHashSet<>();
        coresArcoIris.add("Vermelho");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Violeta");

        Iterator<String> coresIn = coresArcoIris.iterator();

        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        System.out.println("Quantidade de cores: " +coresArcoIris.size());
        System.out.println("-------------------------");


        System.out.println("Cores em ordem alfabética");
        Set<String> coresArcoIrisOrdemAlfabetica = new TreeSet<>();
        coresArcoIrisOrdemAlfabetica.addAll(coresArcoIris);

        for (String cor2 : coresArcoIrisOrdemAlfabetica) {
            System.out.println(cor2);
        }
        System.out.println("Quantidade de cores: " +coresArcoIrisOrdemAlfabetica.size());
        System.out.println("-------------------------");

        System.out.println("Cores em ordem inversa: ");

        List<String> coresArcoIrisInverso = new ArrayList<>();
        coresArcoIrisInverso.addAll(coresArcoIris);

        Collections.reverse(coresArcoIrisInverso);
        
        for (String cor3 : coresArcoIrisInverso) {
            System.out.println(cor3);
        }
        System.out.println("Quantidade de cores: " +coresArcoIrisInverso.size());
        System.out.println("-------------------------");

        System.out.println("Cores que começam com a letra V: ");
       int countRemove = 0;
        while (coresIn.hasNext()) {
           if (!coresIn.next().startsWith("V")){
          coresIn.remove();
          countRemove++;
           }
        }
       for (String cor4 : coresArcoIris) {
        System.out.println(cor4);
       }
       System.out.println("Quantidade de cores: " +coresArcoIris.size());
       System.out.println("Quantidade de cores retiradas " +countRemove);
       System.out.println("-------------------------");

       coresArcoIris.clear();
       if (coresArcoIris.isEmpty() == true){
        System.out.println("Conjunto Vazio");
       } else {
        System.out.println(coresArcoIris);
       }




        
        /*System.out.println("Cores que começam com a letra V: ");
        int countCorV = 0;
        for (String cor : coresArcoIris) {
            if (cor.startsWith("V")){
                System.out.println(cor);;
                countCorV++;
            }
        }
        System.out.println("Quantidade de cores: " +countCorV);
        System.out.println("-------------------------");*/

        



    }
    
}