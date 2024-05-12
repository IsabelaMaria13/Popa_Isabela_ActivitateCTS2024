package main;

import classes.Restaurant;
import client.Client;
import client.Observer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Embassy");
        restaurant.adaugaObserver(new Client("Andrei"));
        restaurant.adaugaObserver(new Client("Ionel"));
        restaurant.trimiteNotificari("Martea burgerilor!");

    }
}