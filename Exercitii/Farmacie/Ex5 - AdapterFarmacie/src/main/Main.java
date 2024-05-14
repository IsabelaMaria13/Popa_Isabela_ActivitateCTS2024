package main;


import classes.*;

public class Main {
    public static void main(String[] args) {
        Medicament nurofen = new Medicament(3, "Nurofen", 10, "durere de cap");
        Medicament fervex = new Medicament(5, "Fervex", 15, "raceala si gripa");

        Vanzare aplicatie = new AplicatieVanzare(nurofen);
        aplicatie.setareMedicament(3);
        if (aplicatie.verificareDisponibilitate(5)) {
            System.out.println("Medicament disponibil");
        } else {
            System.out.println("Nu sunt destule bucati pe stoc");
        }

        GestiuneStocuri gestiuneStocuri = new GestiuneStocuri();
        Vanzare softNou = new Adapter(gestiuneStocuri);

        if (softNou.verificareDisponibilitate(5)) {
            System.out.println("Medicament disponibil");
        } else {
            System.out.println("Nu sunt destule bucati pe stoc");
        }

    }
}