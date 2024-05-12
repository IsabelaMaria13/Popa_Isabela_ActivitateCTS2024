package main;

import classes.Meniu;
import classes.Sectiuni;
import classes.StructuraAbstracta;
import classes.Subsectiuni;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StructuraAbstracta meniu = new Meniu("Meniu");

        StructuraAbstracta startere = new Sectiuni("Startere");
        StructuraAbstracta bauturi = new Sectiuni("Bauturi");
        StructuraAbstracta desert = new Sectiuni("Desert");

        StructuraAbstracta suc = new Subsectiuni("Suc");
        StructuraAbstracta vin = new Subsectiuni("Vin");
        StructuraAbstracta apa = new Subsectiuni("Apa");

        StructuraAbstracta bruschete = new Subsectiuni("Bruschete");
        StructuraAbstracta salata = new Subsectiuni("Salata de vinete");
        StructuraAbstracta icre = new Subsectiuni("Icre");


        StructuraAbstracta tiramisu = new Subsectiuni("Tiramisu");
        StructuraAbstracta papanasi = new Subsectiuni("Papanasi");
        StructuraAbstracta clatite = new Subsectiuni("Clatite");

        bauturi.adaugaStructura(suc);
        bauturi.adaugaStructura(vin);
        bauturi.adaugaStructura(apa);

        startere.adaugaStructura(bruschete);
        startere.adaugaStructura(salata);
        startere.adaugaStructura(icre);

        desert.adaugaStructura(tiramisu);
        desert.adaugaStructura(papanasi);
        desert.adaugaStructura(clatite);

        meniu.adaugaStructura(startere);
        meniu.adaugaStructura(bauturi);
        meniu.adaugaStructura(desert);

        meniu.afiseazaDescriere(" ");
    }
}