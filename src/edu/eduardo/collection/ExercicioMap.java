package edu.eduardo.collection;


import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class ExercicioMap {
    
    public static void main(String[] args) {
        Map<String, Double> carros = new HashMap<>();
        carros.put("uno", 16.1);
        carros.put("palio", 19.9);
        carros.put("sandero", 12.6);

        for (Map.Entry<String, Double> entry: carros.entrySet()) {
            System.out.println("Modelo: " + entry.getKey() + " - Consumo: " +entry.getValue());
        }
        System.out.println("---------------------------");

        //Exibir o modelo mais eficiente

        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloMaisEficiente = "";
        Double consumoMaisEficiente = Collections.max(carros.values());

        String modeloMenosEficiente = "";
        Double consumoMenosEficiente = Collections.min(carros.values());

        for (Map.Entry<String,Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)){
            modeloMaisEficiente = entry.getKey();

            System.out.println(modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        for (Map.Entry<String,Double> entry : entries) {
            if (entry.getValue().equals(consumoMenosEficiente)){
            modeloMenosEficiente = entry.getKey();

            System.out.println(modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }


        

        //Somar os values
        Double soma = 0d;
        Iterator<Double> iterator = carros.values().iterator();

        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma dos Consumos: " +soma);
        System.out.println("Média de consumo: " +(soma / carros.size()));


        /* 
        for (Map.Entry<String,Double> entry : entries) {
            
            soma += entry.getValue();

        }
        System.out.println("Soma dos Consumos: " +soma); 
        */
       Iterator<Double> iterator1 = carros.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(12.6)){
                iterator1.remove();
            }
        }
        System.out.println(carros);

        Map<String, Double> carros2 = new LinkedHashMap<>();
        carros2.put("uno", 16.1);
        carros2.put("palio", 19.9);
        carros2.put("sandero", 12.6);

        System.out.println("Em ordem: " +carros2);

        Map<String, Double> carros3 =new TreeMap<>();
        carros3.put("uno", 16.1);
        carros3.put("palio", 19.9);
        carros3.put("sandero", 12.6);

        System.out.println(carros3);
    }

}
