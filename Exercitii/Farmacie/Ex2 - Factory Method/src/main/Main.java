package main;

import classes.MedicamentDurere;
import classes.Medicamente;
import factory.FabricaMedicamentDurere;
import factory.FabricaMedicamenteBody;
import factory.FabricaMedicamenteRaceala;
import factory.MedicamenteFabrica;

public class Main {
    public static void creareMedicament(MedicamenteFabrica fabrica, String denumire, int pret){
        Medicamente medicament = fabrica.creareMedicament(denumire,pret);
        medicament.afiseazaDetalii();
    }
    public static void main(String[] args) {
        creareMedicament(new FabricaMedicamentDurere(), "Nurofen", 40);
        creareMedicament(new FabricaMedicamenteBody(), "Midocalm", 50);
        creareMedicament(new FabricaMedicamenteRaceala(), "Fervex", 30);
    }
}