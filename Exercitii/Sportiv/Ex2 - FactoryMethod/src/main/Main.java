package main;

import classes.Sportiv;
import factory.FabricaAtacant;
import factory.FabricaFundas;
import factory.FabricaPortar;
import factory.FabricaSportiv;

public class Main {
    public static void creareSportiv(FabricaSportiv fabricaSportiv, String nume, int numar){
        Sportiv sportiv = fabricaSportiv.creareSportiv(nume, numar);
        sportiv.afiseazaDetalii();

    }
    public static void main(String[] args) throws Exception{
        creareSportiv(new FabricaFundas(), "Ilie", 10);
        creareSportiv(new FabricaPortar(), "Vasile", 11);
        creareSportiv(new FabricaAtacant(), "Ionel", 17);
    }
}