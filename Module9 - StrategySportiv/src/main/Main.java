package main;

import classes.Portar;
import classes.VerificatorPeluza;
import classes.VerificatorTribuna;
import classes.VerificatorVIP;

public class Main {
    public static void main(String[] args) {
        Portar portar = new Portar();
        String suporter1 = "Ionel Ionescu VIP";
        String suporter2 = "Paul Paulescu Peluza";
        String suporter3 = "Marian Maurescu Tribuna";

        portar.setStrategie(new VerificatorVIP());
        portar.verificaSuporter(suporter1);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporter(suporter3);

        portar.setStrategie(new VerificatorPeluza());
        portar.verificaSuporter(suporter2);
    }
}