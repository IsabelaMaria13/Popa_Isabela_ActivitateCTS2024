package factory;

import classes.Fundas;
import classes.Sportiv;

public class FabricaFundas extends FabricaSportiv{
    @Override
    public Sportiv creareSportiv(String nume, int numar) {
        return new Fundas(nume, numar);
    }
}
