package main;

import classes.Meniu;
import classes.RestaurantBuilder;

public class Main {
    public static void main(String[] args) {
        Meniu meniu = new RestaurantBuilder()
                .setAsezareLaGeam(true)
                .setDecorareaMesei(true)
                .setMuzicaAmbientalaPersonalizata(true)
                .build();
        System.out.println(meniu);

    }
}