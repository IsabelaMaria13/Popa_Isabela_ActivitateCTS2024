package main;

import observer.Abonat;
import observer.Observer;
import subject.Farmacie;
import subject.Subject;

public class Main {
    public static void main(String[] args) {
        Observer Sorana = new Abonat("Sorana");
        Observer Ioana = new Abonat("Ioana");
        Observer Samara = new Abonat("Samara");

        Subject Dona = new Farmacie("DONA");

        Dona.adaugaAbonat(Samara);
        Dona.adaugaAbonat(Sorana);
        Dona.adaugaAbonat(Ioana);

        Dona.trimiteNotificare("Farmacia DONA va asteapta la noul sediu din Complexul Comerdial Carrefour Orhideea");

        Dona.stergeAbonat(Ioana);
        Dona.trimiteNotificare("Farmaciile DONA sunt inchise in perioada 24-26 DEC.");
    }
}