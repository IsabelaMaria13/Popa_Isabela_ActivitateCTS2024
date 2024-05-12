package main;

import classes.Departament;
import classes.Sectie;
import classes.StructuraAbstractaSectie;

public class Main {
    public static void main(String[] args) {
        StructuraAbstractaSectie spital = new Departament("Spital", "Carmen Ionela");

        StructuraAbstractaSectie cardiologie = new Departament("Cardiologie", "Ioan Vasile");
        StructuraAbstractaSectie oftalmologie = new Departament("Oftalmologie", "Tudoar Marian");

        StructuraAbstractaSectie terapieIntensiva = new Sectie("ATI", 10, "Maria Ioana");
        StructuraAbstractaSectie donare=new Sectie("Donare de sange", 5, "Ionut Anghel");
        StructuraAbstractaSectie optometrie = new Sectie("Optometrie", 2, "Ionut Alexandru");

        cardiologie.adaugaStructura(terapieIntensiva);
        cardiologie.adaugaStructura(donare);

        oftalmologie.adaugaStructura(optometrie);

        spital.adaugaStructura(oftalmologie);
        spital.adaugaStructura(cardiologie);

        spital.afiseazaDescriere(" ");
    }
}