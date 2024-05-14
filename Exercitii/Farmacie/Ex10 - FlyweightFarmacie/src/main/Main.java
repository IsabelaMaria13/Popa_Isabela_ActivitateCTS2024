package main;

import classes.Client;
import classes.Fabrica;
import classes.Reteta;

public class Main {
    public static void main(String[] args) {

        Fabrica fabrica = new Fabrica();

        Reteta reteta1 = new Reteta(10, 100, 3);
        Reteta reteta2 = new Reteta(3, 25, 1);

        Client ion = new Client("Ion", 34);
        Client george = new Client("George", 50);

        fabrica.getReteta("Ion", 34).achizitionare(reteta1);
        fabrica.getReteta("George", 33).achizitionare(reteta2);
    }
}