package factory;

import classes.Atacant;
import classes.Fundas;
import classes.Portar;
import classes.Sportiv;

public class FabricaSportiv {
    public Sportiv creareSportiv(TipSportiv tipSportiv, String nume, int numar) throws Exception{
        switch (tipSportiv){
            case fundas -> {
                return new Fundas(nume, numar);
            }
            case portar -> {
                return new Portar(nume, numar);
            }
            case atacant -> {
                return new Atacant(nume, numar);
            }
            default -> throw new Exception("Nu exista tipul de sportiv!");
        }
    }
}
