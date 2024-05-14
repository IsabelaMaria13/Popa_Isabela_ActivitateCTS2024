package main;


import classes.Facade;
import classes.Medicament;

public class Main {
    public static void main(String[] args) {
        Facade vanzare = new Facade();
        Medicament medicament = new Medicament("Nurofen", 10);

        vanzare.vanzareMedicament(medicament);
    }
}