package main;

import classes.Departament;
import classes.Sectie;
import classes.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta spital = new Departament("Spital", "Carmen Ionela");

        StructuraAbstracta cardiologie = new Departament("Cardiologie", "Ioan Vasile");
        StructuraAbstracta oftalmologie = new Departament("Oftalmologie", "Tudoar Marian");

        StructuraAbstracta terapieIntensiva = new Sectie("ATI", 10, "Maria Ioana");
        StructuraAbstracta donare=new Sectie("Donare de sange", 5, "Ionut Anghel");
        StructuraAbstracta optometrie = new Sectie("Optometrie", 2, "Ionut Alexandru");

        cardiologie.adaugaStructura(terapieIntensiva);
        cardiologie.adaugaStructura(donare);

        oftalmologie.adaugaStructura(optometrie);

        spital.adaugaStructura(oftalmologie);
        spital.adaugaStructura(cardiologie);

        spital.afiseazaDescriere(" ");


    }
}