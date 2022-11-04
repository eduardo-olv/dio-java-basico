package edu.eduardo.POO;

public class Aplicacao {
    
    
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setModelo("Fiat Cronos");
        carro1.setCor("Prata");
        carro1.setCapacidadeTanque(50);
        System.out.println("Modelo do carro: " +carro1.getModelo());
        System.out.println("Cor do carro: " +carro1.getCor());
        System.out.println("Capacidade do tanque: " +carro1.getCapacidadeTanque()+"L");
        System.out.println("Total para encher o tanque: R$ "+carro1.totalValorTanque(4.50));

        carro2.setModelo("Fiat Palio");
        carro2.setCor("Prata");
        carro2.setCapacidadeTanque(30);
        System.out.println("Modelo do carro: " +carro2.getModelo());
        System.out.println("Cor do carro: " +carro2.getCor());
        System.out.println("Capacidade do tanque: " +carro2.getCapacidadeTanque()+"L");
        System.out.println("Total para encher o tanque: R$ "+carro2.totalValorTanque(4.50));
    }
}
