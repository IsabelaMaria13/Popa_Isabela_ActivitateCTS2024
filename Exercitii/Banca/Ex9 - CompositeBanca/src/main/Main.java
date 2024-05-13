package main;


import classes.Agentie;
import classes.Filiala;
import classes.StructuraAbstracta;
import classes.Sucursala;

public class Main {
    public static void main(String[] args) {

        StructuraAbstracta BRD = new Sucursala("BRD", 1000);
        StructuraAbstracta Mihalache = new Agentie("BRD ION MIHALACHE", 100);
        StructuraAbstracta Basarab = new Agentie("BRD BASARAB", 100);

        StructuraAbstracta filiala1 =  new Filiala("FILIALA 1", 20);
        StructuraAbstracta filiala2 = new Filiala("FILIALA 2", 30);
        StructuraAbstracta filiala3 = new Filiala("FILIALA 3", 30);
        StructuraAbstracta filiala4 = new Filiala("FILIALA 4", 10);
        StructuraAbstracta filiala5 = new Filiala("FILIALA 5", 15);
        StructuraAbstracta filiala6 = new Filiala("FILIALA 6", 30);

        BRD.adaugaStructura(Mihalache);
        BRD.adaugaStructura(Basarab);

        Mihalache.adaugaStructura(filiala1);
        Mihalache.adaugaStructura(filiala2);
        Basarab.adaugaStructura(filiala3);
        Basarab.adaugaStructura(filiala4);
        Basarab.adaugaStructura(filiala5);
        Basarab.adaugaStructura(filiala6);

        BRD.afiseaza(" ");
    }
}