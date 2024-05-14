package main;

import classes.Farmacie;
import classes.Sectiune;
import classes.StructuraAbstracta;
import classes.Subsectiune;

public class Main {
    public static void main(String[] args) {

        StructuraAbstracta farmacie = new Farmacie("FARMACIE");

        StructuraAbstracta raceala = new Sectiune("RACEALA");
        StructuraAbstracta durere = new Sectiune("DURERE");
        StructuraAbstracta antibiotice = new Sectiune("ANTIBIOTICE");

        StructuraAbstracta adulti = new Subsectiune("ADULTI");
        StructuraAbstracta copii = new Subsectiune("COPII");

        farmacie.adaugaStructura(raceala);
        farmacie.adaugaStructura(durere);
        farmacie.adaugaStructura(antibiotice);

        raceala.adaugaStructura(adulti);
        raceala.adaugaStructura(copii);

        durere.adaugaStructura(adulti);
        durere.adaugaStructura(copii);

        antibiotice.adaugaStructura(adulti);
        antibiotice.adaugaStructura(copii);

        farmacie.afiseaza(" ");
    }
}