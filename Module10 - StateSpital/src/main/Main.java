package main;

import classes.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Gheorghe");
        pacient.seAgraveazaStarea();
        pacient.vindecare();
        pacient.seImbunatatesteStarea();
        pacient.vindecare();

        Pacient pacient2 = new Pacient("Tudor");
        pacient2.seAgraveazaStarea();
        pacient2.seImbunatatesteStarea();


    }
}