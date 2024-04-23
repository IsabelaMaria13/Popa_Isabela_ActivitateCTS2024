package main;

import classes.Card;
import classes.Cash;
import classes.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ionel Ionescu");
        Pacient pacient1 = new Pacient("Maria Marinescu");
        Pacient pacient2 = new Pacient("Razvan Razescu");

        pacient1.setModPlata(new Cash());
        pacient1.plateste(100);
        pacient.setModPlata(new Card());
        pacient.plateste(300);

        pacient2.plateste(50);
    }
}