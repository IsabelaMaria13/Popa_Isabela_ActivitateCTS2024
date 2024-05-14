package main;

import classes.Farmacie;
import classes.Medicament;
import classes.Template;

public class Main {
    public static void main(String[] args) {
        Medicament nurofen = new Medicament("Nurofen", 25, 4);
        Medicament fervex = new Medicament("Fervex", 35, 2);

        Template farmacie = new Farmacie();
        farmacie.adaugaMedicament(nurofen);
        farmacie.adaugaMedicament(fervex);

        farmacie.vanzare("Nurofen", 3);
        System.out.println("\n");
        farmacie.vanzare("Fervex", 3);
        System.out.println("\n");
        farmacie.vanzare("Parasinus", 2);

    }
}