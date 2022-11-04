package edu.eduardo.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExercicioMap2 {
    public static void main(String[] args) {
        Map<String, Livro> livros = new HashMap<>(){{
        put("Lovecraft, HP", new Livro("Call of Cthulhu", 160));
        put("Arbec, Daniela", new Livro("Holocausto Brasileiro", 255));
        put("Miura, Kentaro", new Livro("Berserk", 240));
        put("Tzu, Sun", new Livro("A Arte da Guerra", 150));
    
        }};

         System.out.println("Map de Livros: ");

         for (Map.Entry<String, Livro> indice: livros.entrySet()) {
            System.out.println(indice.getKey() + " | " +indice.getValue().getTitulo() + " | " +indice.getValue().getPaginas());
            }
        
        

         System.out.println("-------------------------------");
          System.out.println("Livros em ordem de inserção: ");

        Map<String, Livro> livrosIns = new LinkedHashMap<>(){{
            put("Miura, Kentaro", new Livro("Berserk", 240));
            put("Arbec, Daniela", new Livro("Holocausto Brasileiro", 255));
            put("Lovecraft, HP", new Livro("Call of Cthulhu", 160));
            put("Tzu, Sun", new Livro("A Arte da Guerra", 150));
        }};
       

        
        for (Map.Entry<String, Livro> indice: livrosIns.entrySet()) {
            System.out.println("Autor: " +indice.getKey() + " | Título: " +indice.getValue().getTitulo() + " | Páginas: " +indice.getValue().getPaginas());
        }

      

        System.out.println("-------------------------------");
        System.out.println("Livros em ordem de Natural: ");

        Map<String, Livro> livrosNat = new TreeMap<>();
        livrosNat.putAll(livros);

        for (Map.Entry<String, Livro> indice: livrosNat.entrySet()) {
            System.out.println("Autor: " +indice.getKey() + " | Título: " +indice.getValue().getTitulo() + " | Páginas: " +indice.getValue().getPaginas());
        }

        System.out.println("-------------------------------");
        System.out.println("Livros em ordem de Título: ");

       Set<Map.Entry<String, Livro>> livrosTitulo = new TreeSet<>(new ComparatorTitulo());
        livrosTitulo.addAll(livros.entrySet());
    
        for (Entry<String,Livro> entry : livrosTitulo) {
            System.out.println(entry);
        }

        System.out.println("-------------------------------");
        System.out.println("Livros em ordem de Páginas: ");

       Set<Map.Entry<String, Livro>> livrosPaginas = new TreeSet<>(new ComparatorPaginas());
        livrosPaginas.addAll(livros.entrySet());
    
        for (Entry<String,Livro> entry : livrosPaginas) {
            System.out.println(entry);
        }
    }

    



    static class Livro {
        private String titulo;
        private int paginas;

        public Livro(String titulo, int paginas){
            this.titulo = titulo;
            this.paginas = paginas;
        }


        public String getTitulo(){
            return titulo;
        }

        public int getPaginas(){
            return paginas;
        }

        @Override
        public String toString() {
            
            return " " + titulo + ", " + paginas + "p";
        }

        
    }
    
    
    static class ComparatorTitulo implements Comparator<Map.Entry<String, Livro>>{

        @Override
        public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
            
            return l1.getValue().getTitulo().compareTo(l2.getValue().getTitulo());
        }

       

       
    }

    static class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>>{

        @Override
        public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
            
            return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
        }


    }

}
