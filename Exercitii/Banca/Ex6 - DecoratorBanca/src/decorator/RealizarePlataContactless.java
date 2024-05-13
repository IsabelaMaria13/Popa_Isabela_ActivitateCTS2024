package decorator;

import classes.IRealizarePlata;

public class RealizarePlataContactless extends Decorator{
    private IRealizarePlata realizarePlata;

    public RealizarePlataContactless(IRealizarePlata realizarePlata) {
        this.realizarePlata = realizarePlata;
    }
    @Override
    public void realizeazaPlata() {
        realizarePlata.realizeazaPlata();
        System.out.println("Acum aveti optiunea de a plati si cu cardul contacless");
    }
}
