package edu.eduardo.POO.PolimorfismoSobrescrita;

public class RodarAplicacao {
    
    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes){
            classe.metodo1();                                 //POLIMORFISMOS
        }

        for (ClasseMae classe: classes){
            classe.metodo2();
        }

        System.out.println("-------------------");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();           //SOBRESCRITA
        classeFilha2.metodo2();
    }

}
