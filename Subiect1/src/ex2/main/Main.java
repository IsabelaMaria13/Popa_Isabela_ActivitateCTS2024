package ex2.main;


import ex2.classes.Bicicleta;
import ex2.classes.BicicletaBuilder;

public class Main {
    public static void main(String[] args) {
        BicicletaBuilder builder = new BicicletaBuilder();
        Bicicleta bicicleta = builder
                .setHasCascaProtectie(true)
                .setHasOchelari(true)
                .setNumeModel("MTB")
                .setTipFrana("A")
                .setPret(100.0)
                .build();
        bicicleta.afisareDetalii();

    }
}