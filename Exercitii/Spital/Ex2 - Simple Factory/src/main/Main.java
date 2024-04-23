package main;

import classes.Asistent;
import classes.Brancardier;
import classes.Medic;
import classes.PersonalSpital;
import fabrica.PersonalFactory;
import fabrica.TipPersonal;

public class Main {
    public static void main(String[] args) throws Exception {
        PersonalFactory fabrica = new PersonalFactory();
        PersonalSpital medic = fabrica.createPesonal(TipPersonal.medic, "Ion", 1400);
        PersonalSpital asistent = fabrica.createPesonal(TipPersonal.asistent, "Laur", 500);
        medic.afisareDetalii();
        asistent.afisareDetalii();

    }
}