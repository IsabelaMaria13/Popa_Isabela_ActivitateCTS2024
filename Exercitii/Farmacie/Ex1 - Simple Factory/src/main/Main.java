package main;

import factory.FabricaMedicamente;
import factory.TipMedicament;

public class Main {
    public static void main(String[] args) throws Exception{
        FabricaMedicamente fabricaMedicamente = new FabricaMedicamente();
        fabricaMedicamente.creareaMedicament(TipMedicament.body, "Avene", 150).afisareDetalii();
        fabricaMedicamente.creareaMedicament(TipMedicament.raceala, "Teraflu", 40).afisareDetalii();
        fabricaMedicamente.creareaMedicament(TipMedicament.durere, "Nurofen", 30).afisareDetalii();
    }
}