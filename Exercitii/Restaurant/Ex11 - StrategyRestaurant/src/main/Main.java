package main;

import classes.Card;
import classes.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Andrei");
        client.setModalitatePlata(new Card());
        client.plateste();
    }
}