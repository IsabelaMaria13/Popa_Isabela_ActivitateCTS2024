package factory;

import classes.Meniu;
import classes.SupaVita;

import java.util.List;

public class SupaVitaFactory implements RestaurantFactory{
    @Override
    public Meniu creareMeniu(List<String> ingrediente, int cantitate) {
        return new SupaVita(ingrediente, cantitate);
    }
}
