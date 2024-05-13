package main;


import classes.Banca;
import classes.CreareCredit;
import classes.CreareCreditRON;
import classes.Credit;

public class Main {
    public static void main(String[] args) {
        Credit credit1 = new Credit("Ioan", 1000, "RON");
        Credit credit2 = new Credit("Carla", 2000, "USD");

        Banca banca = new CreareCredit();
        Banca proxy = new CreareCreditRON(banca);

        proxy.creareCredit(credit1);
        proxy.creareCredit(credit2);
    }
}