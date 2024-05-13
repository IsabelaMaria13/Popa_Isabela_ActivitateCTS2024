package main;


import observer.Observer;
import observer.Abonat;
import subject.Banca;
import subject.Subject;

public class Main {
    public static void main(String[] args) {
        Observer Razvan = new Abonat("Razvan");
        Observer Robert = new Abonat("Robert");
        Observer Radu = new Abonat("Radu");

        Subject banca = new Banca();
        banca.adaugaAbonat(Radu);
        banca.adaugaAbonat(Razvan);
        banca.adaugaAbonat(Robert);

        banca.trimiteNotificare();
        banca.stergeAbonat(Razvan);
        banca.trimiteNotificare();
    }
}