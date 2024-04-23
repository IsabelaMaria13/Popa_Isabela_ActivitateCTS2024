package main;


import factory.FabricaMijlocTransport;
import factory.TipMijlocTransport;

public class Main {
    public static void main(String[] args) throws Exception {
        FabricaMijlocTransport fabricaMijlocTransport = new FabricaMijlocTransport();
        fabricaMijlocTransport.creareMijlocTransport(TipMijlocTransport.Autobuz, "B 45 TSA", "BMW").afiseazaDetalii();
        fabricaMijlocTransport.creareMijlocTransport(TipMijlocTransport.Trolebuz, "B 66 TGA", "BMW").afiseazaDetalii();
        fabricaMijlocTransport.creareMijlocTransport(TipMijlocTransport.Tramvai, "B 101 PKA", "BMW").afiseazaDetalii();
    }
}