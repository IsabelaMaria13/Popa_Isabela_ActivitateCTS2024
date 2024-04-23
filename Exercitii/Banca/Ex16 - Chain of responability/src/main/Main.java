package main;

import classes.ClientBanca;
import classes.PlataCard1;
import classes.PlataCard2;
import classes.PlataCard3;

public class Main {
    public static void main(String[] args) {
        PlataCard1 card1 = new PlataCard1(500);
        PlataCard2 card2 = new PlataCard2(1000);
        PlataCard3 card3 = new PlataCard3(700);

        card1.setUrmatorulCard(card2);
        card2.setUrmatorulCard(card3);

        ClientBanca client = new ClientBanca("Ionel Ionescu", 1000);
        card1.plateste(client, client.getSumaPlata());

    }
}