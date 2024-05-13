package main;


import classes.Banca;
import classes.Client;
import classes.Cont;
import classes.IFlyweight;

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca();
        Cont contRon = new Cont(190, 2000);
        Cont conrEur = new Cont(100, 3000);

        IFlyweight client = new Client("Mihai", "ceva", "10391838", "ceva");

        banca.creareCont(190, client).creareCont(contRon);
        banca.creareCont(100, client).creareCont(conrEur);

    }
}