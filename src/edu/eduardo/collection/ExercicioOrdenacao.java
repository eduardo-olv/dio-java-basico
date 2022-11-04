package edu.eduardo.collection;


import java.util.Comparator;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ExercicioOrdenacao {
    public static void main(String[] args) {
        Map<Integer, Contato> agenda = new HashMap<>();
        agenda.put(1, new Contato("Simba", 2222));
        agenda.put(4, new Contato("Cami", 5555));
        agenda.put(3, new Contato("Jon", 1111));

        System.out.println("Agenda em ordem aleatória: ");
        for (Entry<Integer, Contato> i : agenda.entrySet()) {
            System.out.println("Id: "+ i.getKey() + " " +i.getValue());
        }
        System.out.println("-------------------------------");

        Set<Map.Entry<Integer, Contato>> agendaSet = new TreeSet<>(Comparator.comparing(c -> c.getValue().getNome()));
             agendaSet.addAll(agenda.entrySet());

        System.out.println("Agenda em ordem de nome: ");
        for (Map.Entry<Integer, Contato> i : agendaSet) {
            System.out.println("Id: "+ i.getKey() + " " +i.getValue());
        }
        System.out.println("-------------------------------");

        Set<Map.Entry<Integer, Contato>> agendaSetNumero = new TreeSet<>(new comparatorNumero());
        agendaSetNumero.addAll(agenda.entrySet());

        System.out.println("Agenda em ordem de número: ");
        for (Map.Entry<Integer, Contato> i : agendaSetNumero) {
            System.out.println("Id: "+ i.getKey() + " " +i.getValue());
        }
        System.out.println("-------------------------------");



    }
}       

class Contato{
    String nome;
    int numero;
    public Contato(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        
        return " | Contato: " +nome + ", Número: " +numero;
    }
}   

class comparatorNome implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Entry<Integer, Contato> c1, Entry<Integer, Contato> c2) {
        
        return c1.getValue().getNome().compareTo(c2.getValue().getNome());
    }
    
}


class comparatorNumero implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Entry<Integer, Contato> c1, Entry<Integer, Contato> c2) {
        
        return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
    }



}

class comparatorNomeNumeroId implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
        
        return 0;
    }

}

