package factory;

import classes.Atacant;
import classes.Sportiv;

public class FabricaAtacant extends FabricaSportiv{

    @Override
    public Sportiv creareSportiv(String nume, int numar) {
        return new Atacant(nume, numar);
    }
}
