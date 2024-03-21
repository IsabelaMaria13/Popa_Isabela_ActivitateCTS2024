package main;

import classes.RetetaAbstracta;
import classes.RetetaMedicament;

public class Main {
    public static void main(String[] args) {
        RetetaAbstracta reteta1 = new RetetaMedicament("ibrupofen", 10);
        RetetaAbstracta reteta2 = reteta1.clone();

        reteta1.afiseazaDetalii();
        reteta2.afiseazaDetalii();
    }
}