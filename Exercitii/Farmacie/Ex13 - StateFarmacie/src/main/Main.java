package main;


import classes.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(4);

        reteta.vanzareMedicamente();
        reteta.cerereMedicamente();
        reteta.vanzareMedicamente();

    }
}