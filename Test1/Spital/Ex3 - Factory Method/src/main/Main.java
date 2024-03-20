package main;

import classes.PersonalSpital;
import factory.AsistentFactory;
import factory.InfirmierFactory;
import factory.PersonalFactory;

public class Main {
    public static void crearePersonal(PersonalFactory factory, String nume, int salariu){
        PersonalSpital personal = factory.createPersonal(nume, salariu);
        personal.afisareDetalii();
    }

    public static void main(String[] args) {

        crearePersonal( new AsistentFactory(), "Ion", 1000);
        crearePersonal(new InfirmierFactory(), "Laur", 500);

    }
}