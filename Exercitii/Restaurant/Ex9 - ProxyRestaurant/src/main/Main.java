package main;

import classes.Client;
import classes.RezervareClient;
import classes.RezervarePrinProxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client client =  new Client("Ionel", "12.05.2024", 4);
        Client client1 = new Client("Dorel", "13.05.2024", 2);
        Client client2 = new Client("Popel", "12.05.2024", 8);
        RezervareClient rezervareClient = new RezervareClient(true);
        RezervarePrinProxy proxy = new RezervarePrinProxy(rezervareClient);
        proxy.rezervaMasa(client);
        proxy.rezervaMasa(client1);
        proxy.rezervaMasa(client2);
    }
}