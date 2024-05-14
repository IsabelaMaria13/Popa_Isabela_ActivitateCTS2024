package main;


import classes.CardFarmacie;
import classes.Client;

public class Main {
    public static void main(String[] args) {

        Client client =  new Client("Anton");
        client.realizarePlata();

        client.setModPlata(new CardFarmacie());
        client.realizarePlata();
    }
}