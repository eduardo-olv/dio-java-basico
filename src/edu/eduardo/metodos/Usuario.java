package edu.eduardo.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        tvSmart tvSmart = new tvSmart();

            System.out.println("TV LIGADA? " + tvSmart.ligada);


            tvSmart.ligar ();
              

            System.out.println("Canal Atual: " + tvSmart.canal);
            System.out.println("Volume Atual: " + tvSmart.volume);

            tvSmart.diminuirVolume();
            tvSmart.diminuirVolume();
            tvSmart.diminuirVolume();
            tvSmart.diminuirVolume();
            tvSmart.aumentarVolume();
            
            tvSmart.subirCanal();
            tvSmart.subirCanal();
            tvSmart.subirCanal();
            tvSmart.descerCanal();
            tvSmart.mudarCanal(13);

            tvSmart.desligar ();
                

    }
}
