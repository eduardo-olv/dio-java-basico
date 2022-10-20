package edu.eduardo.metodos;
public class tvSmart {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

public void ligar(){
    ligada = true;
}

public void desligar(){
    ligada = false;
}

public void aumentarVolume(){
    volume++ ;
    System.out.println("Aumentando Volume para: " + volume);
}

public void diminuirVolume(){
    volume-- ;
    System.out.println("Diminuindo Volume para: " + volume);
}

public void subirCanal(){
    canal++;
    System.out.println("Canal " + canal);
}

public void descerCanal(){
    canal--;
    System.out.println("Canal " + canal);
}

public void mudarCanal(int novoCanal){
    canal = novoCanal;
    System.out.println("Canal " + canal);
}


}


