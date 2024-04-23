package main;

import classes.Spital;
import client.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient Ionescu =  new Pacient("Ionel Ionescu");
        Pacient Popescu = new Pacient("Paul Popescu");
        Pacient Marinescu = new Pacient("Marian Marinescu");

        Spital spital = new Spital("Regina Maria");

        spital.adaugaObserver(Ionescu);
        spital.adaugaObserver(Popescu);
        spital.adaugaObserver(Marinescu);

        spital.trimiteNotificare("Pandemia de COVID19 s-a terminat");
        spital.notificareReducereAnalize();
        spital.stergeObserver(Popescu);
        spital.trimiteNotificare("O noua pandemie apare");

    }
}