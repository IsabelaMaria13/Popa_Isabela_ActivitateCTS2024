package main;

import classes.RetetaMedicament;

public class Main {
    public static void main(String[] args) {
        RetetaMedicament.Reteta reteta = new RetetaMedicament.Reteta();
        RetetaMedicament medicament = reteta
                .setNumarPungi(true)
                .setCardFidelitate(true)
                .setCotaTVA(true)
                .setPlataCuCard(true)
                .build();
        System.out.println(medicament);

    }
}