package edu.eduardo.exercicios;

public class teste {
    public static void main(String[] args) {
      boolean casado = true;
      boolean filhos = true;
      boolean baixoSalario = true;

      boolean recebeAuxilio = casado && filhos && baixoSalario;

      if (recebeAuxilio){
        System.out.println("Apto a receber auxilio!");
    
      }else {
        System.out.println("Não precisa de auxilio!");
        }

    }
      
    

}