package edu.eduardo.collection;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class ExercicioListaDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println("Telefonou para a vítima?");
        respostas.add(scan.nextLine());
        System.out.println("Esteve no local do crime?");
        respostas.add(scan.nextLine());
        System.out.println("Mora perto da vítima?");
        respostas.add(scan.nextLine());
        System.out.println("Devia para a vítima?");
        respostas.add(scan.nextLine());
        System.out.println("Já trabalhou com a vítima?");
        respostas.add(scan.nextLine());
        scan.close();

        int count = 0;
        for (String resp : respostas) {
           if (resp.contains("s") == true) count++;
        }
        
        
        switch (count) {
            case 0:
            case 1:
                
                System.out.println("Você é inocente");
                break;
            case 2:

                System.out.println("Hmm, você é suspeito");
                break;
            case 3:
            case 4:

                System.out.println("Ei! você é um cúmplice!");
                break;
            case 5:

                System.out.println("Você só pode ser o Assassino!!!");
                break;
        
            default:
                System.out.println("Algo deu errado...");
                break;
        }
    }
   
}
