package decorator;

import classes.IRealizarePlata;
import classes.RealizarePlata;

public abstract class Decorator implements IRealizarePlata {
    RealizarePlata realizarePlata;

    @Override
    public void realizeazaPlata() {
        realizarePlata.realizeazaPlata();
        System.out.println("Acum aveti optiunea de a plati si cu cardul contacless");
    }
}
