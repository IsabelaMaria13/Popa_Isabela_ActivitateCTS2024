package main;

import classes.Card;
import classes.CardBuilder;

public class Main {
    public static void main(String[] args) {
       Card.Builder contNou = new Card.Builder();
       Card card = contNou
               .setAreCardAtasat(true)
               .setInternetBanking(true)
               .setPrimesteSalariul(true)
               .build();
        System.out.println(card);
    }
}