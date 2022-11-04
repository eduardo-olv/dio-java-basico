package edu.eduardo.POO.Herança;

public class AplicacaoUpDowncast {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendendor = new Vendedor();      // UPCASTS
        Funcionario faxineiro = new Faxineiro();

        Vendedor vendedor = (Vendedor) new Funcionario();  // DOWNCAST
    }

    
}
