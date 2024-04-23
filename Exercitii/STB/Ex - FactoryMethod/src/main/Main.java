package main;

import classes.MijlocTransport;
import factory.FabricaAutobuz;
import factory.FabricaMijlocTransport;
import factory.FabricaTramvai;
import factory.FabricaTrolebuz;

public class Main {
    public static void creareMijlocTransport(FabricaMijlocTransport fabricaMijlocTransport, String nume, String marca)
    {
        fabricaMijlocTransport.creareMijlocTransport(nume, marca).afiseazaDetalii();
    }
    public static void main(String[] args) {
      creareMijlocTransport(new FabricaAutobuz(), "AAAAAAA", "A");
      creareMijlocTransport(new FabricaTramvai(), "BBBBBB", "B");
      creareMijlocTransport(new FabricaTrolebuz(), "CCCCCC", "C");

    }
}