package main;

import classes.clients.Client;
import classes.FabricaClienti;
import classes.FabricaPersoaneFizice;
import classes.FabricaPersoaneJuridice;

public class Main {
    public static void inregistrareClienti(FabricaClienti clienti, String nume, int suma){
        Client client = clienti.creareClienti(nume, suma);
        client.afiseazaDetalii();

    }
    public static void main(String[] args) {
        inregistrareClienti(new FabricaPersoaneFizice(), "Andrei Vasile", 160000);
        inregistrareClienti(new FabricaPersoaneJuridice(), "SRL Constructii", 190900);

    }
}