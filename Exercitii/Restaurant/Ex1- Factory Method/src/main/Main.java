package main;

import classes.Meniu;
import factory.RestaurantFactory;
import factory.SupaCiuperciFactory;
import factory.SupaLegumeFactory;
import factory.SupaVitaFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void creareMeniu(RestaurantFactory factory, List<String> ingrediente, int cantitate){
        Meniu meniu = factory.creareMeniu(ingrediente, cantitate);
        meniu.afisareMeniu();

    }
    public static void main(String[] args) {
        List<String> ingrediente = new ArrayList<>();
        ingrediente.add("apa");
        ingrediente.add("sare");
        ingrediente.add("morcovi");

        creareMeniu(new SupaCiuperciFactory(), ingrediente, 14);
        creareMeniu(new SupaLegumeFactory(), ingrediente, 10);
        creareMeniu(new SupaVitaFactory(), ingrediente, 24);

    }
}