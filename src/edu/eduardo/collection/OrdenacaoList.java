package edu.eduardo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList { 
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add (new Gato("Jon", "Preto", 18));
            add (new Gato("Simba", "Tigrado", 6));
            add (new Gato("Jon", "Amarelo", 12));
        }};

        System.out.println(meusGatos);
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        Collections.sort(meusGatos, new ComparatorNome());
        System.out.println("Nome:");
        System.out.println(meusGatos);

        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println("Idade:");
        System.out.println(meusGatos);

        meusGatos.sort(new ComparatorCor());
        System.out.println("Cores:");
        System.out.println(meusGatos);

        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println("Desempate:");
        System.out.println(meusGatos);

            System.out.println("Teste reference method");
        meusGatos.sort(Comparator.comparing(Gato::getNome));
        System.out.println(meusGatos);
    }

    static class Gato{
        private String nome;
        private String cor;
        private Integer idade;

        public Gato (String nome, String cor, Integer idade){

        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        }

        public String getNome(){
            return nome;
        }

        public String getCor(){
            return cor;
        }

        public Integer getIdade(){
            return idade;
        }

        @Override
        public String toString(){
            return "{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", cor='" + cor +'\'' +
                    '}';
        }

       // @Override
       // public int compareTo(Gato gato) {
            
       //     return this.getNome().compareTo(gato.getNome());
       // }
        
    }

    static class ComparatorIdade implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }

       
        
    }

    static class ComparatorCor implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            return g1.getCor().compareTo(g2.getCor());
        }

       
        
    }
    static class ComparatorNome implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            return g1.getNome().compareTo(g2.getNome());
        }

       
        
    }

    static class ComparatorNomeCorIdade implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            int nome = g1.getNome().compareTo(g2.getNome());
            if (nome != 0) return nome;

            int cor = g1.getCor().compareTo(g2.getCor());
            if (cor != 0) return cor;

            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
        
    }
}
