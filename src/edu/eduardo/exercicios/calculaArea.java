package edu.eduardo.exercicios;

public class calculaArea {

    public static void main(String[] args) {

        int areaQuadrado = area(5);
        System.out.println("Área do quadrado: " +areaQuadrado);

        int areaRetangulo = area(6, 3);
        System.out.println("Área do quadrado: " +areaRetangulo);

        int areaTrapezio = area(15, 6, 32);
        System.out.println("Área do quadrado: " +areaTrapezio);

    }


    public static int area(int lados) {
        return lados * lados;
    }

    public static int area(int base, int altura) {
        return base * altura;
    }

    public static int area(int baseMaior, int baseMenor, int altura) {
        return ((baseMaior + baseMenor) * altura) /2;
    }
}
