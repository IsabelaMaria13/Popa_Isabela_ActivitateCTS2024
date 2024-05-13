package main;


import classes.Client;
import classes.Retragere;
import classes.Template;

public class Main {
    public static void main(String[] args) {
        Client Razvan = new Client("Razvan", true, 300);
        Client Ana = new Client("Ana", false, 600);
        Client Carla = new Client("Carla", true, 5);

        Template retragere = new Retragere();
        retragere.retragere(Razvan, 200);
        retragere.retragere(Ana, 100);
        retragere.retragere(Carla, 10);

    }
}