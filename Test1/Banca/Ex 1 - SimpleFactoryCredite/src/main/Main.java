package main;

import classes.Credite;
import classes.TipCredit;

public class Main {
    public static void main(String[] args) throws Exception{
        Credite credite =new Credite();
        credite.creareCredite(TipCredit.creditIpotecar, "Ionel", 1000).afiseazaDetalii();
        credite.creareCredite(TipCredit.creditBancar, "Maria", 200000).afiseazaDetalii();


    }
}