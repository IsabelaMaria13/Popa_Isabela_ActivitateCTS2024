package factory;

import classes.Portar;
import classes.Sportiv;

public class FabricaPortar extends FabricaSportiv{
    @Override
    public Sportiv creareSportiv(String nume, int numar) {
        return new Portar(nume, numar);
    }
}
