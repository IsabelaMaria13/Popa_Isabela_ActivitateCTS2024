package classes;

import java.util.HashMap;

public class Fabrica {
    private HashMap<String, Flyweight> clienti;

    public Fabrica() {
        this.clienti = new HashMap<>();
    }

    public Flyweight getReteta(String nume, int nrAsigurare) {
        String cheie = "" + nume + "" + nrAsigurare;
        Flyweight flyweight = clienti.get(cheie);
        if (flyweight == null) {
            flyweight = new Client(nume, nrAsigurare);
            clienti.put(cheie, flyweight);
        }
        return flyweight;
    }
}
