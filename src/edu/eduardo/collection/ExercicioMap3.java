package edu.eduardo.collection;


import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExercicioMap3 {
   public static void main(String[] args) {
   Map<String, Integer> estadosNE = new HashMap<>();
   estadosNE.put("PE", 9616621);
   estadosNE.put("AL", 3351543);
   estadosNE.put("CE", 9187103);
   estadosNE.put("RN", 3534265);


   for (Map.Entry<String, Integer> i : estadosNE.entrySet()) {
    System.out.println(i.getKey() + " " + i.getValue());
   }

   System.out.println("-----------------");

   estadosNE.put("RN", 3534165);

   for (Map.Entry<String, Integer> i : estadosNE.entrySet()) {
    System.out.println(i.getKey() + " " + i.getValue());
   }
   
   System.out.println("-----------------");

   if (estadosNE.containsKey("PB") == false) {
    System.out.println("Estado PB não consta na lista!");
    System.out.println("Adicionando...");

    estadosNE.put("PB", 4039277);

    
    System.out.println("Estado PB adicionado! População: " +estadosNE.get("PB"));
   } else {
    System.out.println("Estado PB consta na lista!");
   }

   System.out.println("-----------------");
   System.out.println("Estados em ordem de inserção: ");
   Map<String, Integer> estadosNeLinked = new LinkedHashMap<>();
   estadosNeLinked.put("PE", 9616621);
   estadosNeLinked.put("AL", 3351543);
   estadosNeLinked.put("CE", 9187103);
   estadosNeLinked.put("RN", 3534265);
   estadosNeLinked.put("PB", 4039277);

   for (Map.Entry<String, Integer> i : estadosNeLinked.entrySet()) {
    System.out.println(i.getKey() + " " + i.getValue());
   }

   System.out.println("-----------------");
   System.out.println("Estados em ordem alfabética: ");
   Map<String, Integer> estadosNeTree = new TreeMap<>();
   estadosNeTree.put("PE", 9616621);
   estadosNeTree.put("AL", 3351543);
   estadosNeTree.put("CE", 9187103);
   estadosNeTree.put("RN", 3534265);
   estadosNeTree.put("PB", 4039277);

   for (Map.Entry<String, Integer> i : estadosNeTree.entrySet()) {
    System.out.println(i.getKey() + " " + i.getValue());
   }

   System.out.println("-----------------");
   System.out.println("Estado com a menor população: ");
   
   int menorPopulacao = Collections.min(estadosNE.values());
   String menorEstado = "";

   for (Map.Entry<String, Integer> i : estadosNE.entrySet()) {
    if (i.getValue().equals(menorPopulacao)){
        menorEstado = i.getKey();
    }
   }

   System.out.println(menorEstado + " " + menorPopulacao);

   System.out.println("-----------------");
   System.out.println("Estado com a maior população: ");

   int maiorPopulacao = Collections.max(estadosNE.values());
   String maiorEstado = "";

   for (Map.Entry<String, Integer> i : estadosNE.entrySet()) {
    if (i.getValue().equals(maiorPopulacao)){
        maiorEstado = i.getKey();
    }
   }
   System.out.println(maiorEstado+ " " +maiorPopulacao);

   System.out.println("-----------------");
   System.out.println("Estes dois estados somados tem a população de: ");
   System.out.println(menorEstado+ " + " +maiorEstado+ " = " +menorPopulacao + maiorPopulacao);

   System.out.println("-----------------");
   System.out.println("Média de população entre os estados do NE: ");

   int soma = 0;
   for (Entry<String, Integer> i : estadosNE.entrySet()) {
    soma += i.getValue();
   }
   System.out.println(soma / estadosNE.size());

   System.out.println("-----------------");
   System.out.println("Removendo estados com população menor que 4000000: ");

  Iterator<Integer> i = estadosNE.values().iterator();
  while (i.hasNext()) {
    if (i.next() < 4000000) {
        i.remove();
    }
  }
  for (Map.Entry<String, Integer> j : estadosNE.entrySet()) {
    System.out.println(j.getKey() + " " + j.getValue());
   }

   System.out.println("-----------------");
   System.out.println("Zerando a lista...");

   estadosNE.clear();

   if (estadosNE.isEmpty()) {
    System.out.println("Lista vazia!");
   }
   }

  
}
