package main;

import classes.Pacient;
import classes.SpitalPublic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SpitalPublic spitalPublic = new SpitalPublic("COLTEA", 2);
        Pacient pacient = new Pacient("Andrei", 5);
        Pacient pacient1 = new Pacient("Roxana", 3);
        Pacient pacient2 = new Pacient("Matei", 4);

        spitalPublic.internare(pacient);
        spitalPublic.internare(pacient1);
        spitalPublic.internare(pacient2);


    }
}