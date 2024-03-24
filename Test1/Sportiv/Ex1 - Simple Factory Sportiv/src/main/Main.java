package main;

import factory.FabricaSportiv;
import factory.TipSportiv;

public class Main {
    public static void main(String[] args) throws Exception{
        FabricaSportiv fabricaSportiv = new FabricaSportiv();
        fabricaSportiv.creareSportiv(TipSportiv.portar, "Ilie", 10).afiseazaDetalii();
        fabricaSportiv.creareSportiv(TipSportiv.fundas, "Vasile", 11).afiseazaDetalii();
        fabricaSportiv.creareSportiv(TipSportiv.atacant, "Dumitrache", 12).afiseazaDetalii();

    }
}