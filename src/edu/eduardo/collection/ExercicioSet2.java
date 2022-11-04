package edu.eduardo.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ExercicioSet2 {
    public static void main(String[] args) {
        List<LinguagemFavorita> linguagensLista = new ArrayList<>();
        linguagensLista.add(new LinguagemFavorita("JAVA", 1991, "IntelliJ"));
        linguagensLista.add(new LinguagemFavorita("Python", 1989, "PyCharm"));
        linguagensLista.add(new LinguagemFavorita("C#", 1999, "VsCode"));


        for (LinguagemFavorita insertion : linguagensLista) {
            System.out.println(insertion);
        }
        System.out.println("--------------------------------------------------");
        
        linguagensLista.sort(new comparatorNomeProg());
        for (LinguagemFavorita insertion : linguagensLista) {
            System.out.println(insertion);
        }
        System.out.println("--------------------------------------------------");

        linguagensLista.sort(new ComparatorIde());
        for (LinguagemFavorita insertion : linguagensLista) {
            System.out.println(insertion);
        }
        System.out.println("--------------------------------------------------");

        linguagensLista.sort(new ComparatorAnoDeCriacao());
        for (LinguagemFavorita insertion : linguagensLista) {
            System.out.println(insertion);
        }
        System.out.println("--------------------------------------------------");

        linguagensLista.sort(new ComparatorNomeIdeAnoDeCriacao());
        for (LinguagemFavorita insertion : linguagensLista) {
            System.out.println(insertion);
        }
        System.out.println("--------------------------------------------------");

        for (LinguagemFavorita insertion : linguagensLista) {
            System.out.println(insertion.getNome());
        }
        System.out.println("--------------------------------------------------");


    }


}

class LinguagemFavorita {
    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide){
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome(){
        return nome;
    }

    public int getAnoDeCriacao(){
        return anoDeCriacao;
    }

    public String getIde(){
        return ide;
    }

    @Override
    public String toString(){
        return "Nome: " +nome +" | Ano de criação: " +anoDeCriacao +" | IDE: " +ide;
    }
}

class comparatorNomeProg implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getNome().compareTo(l2.getNome());
    }

}

class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    }

}

class ComparatorAnoDeCriacao implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
    }

}

class ComparatorNomeIdeAnoDeCriacao implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) {return nome;}

        int ide = l1.getIde().compareTo(l2.getIde());
        if (ide != 0) {return ide;}

        return Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
    }

}

