package factory;

import classes.SupaCiuperci;
import classes.SupaLegume;
import classes.SupaVita;
import classes.Supe;

public class MeniuFactory {
    public Supe creareMeniu(TipSupa tipSupa, String nume, int cantitate) throws Exception {
        switch (tipSupa) {
            case Supa_de_vita -> {
                return new SupaVita(nume, cantitate);
            }
            case Supa_de_legume -> {
                return new SupaLegume(nume, cantitate);
            }
            case Supa_de_ciuperci -> {
                return new SupaCiuperci(nume, cantitate);
            }
            default -> throw new Exception("tip de supa inexistent");
        }

    }

}
