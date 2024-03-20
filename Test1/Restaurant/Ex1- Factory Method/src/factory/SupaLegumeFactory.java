package factory;

import classes.Meniu;
import classes.SupaLegume;

import java.util.List;

public class SupaLegumeFactory implements RestaurantFactory{
    @Override
    public Meniu creareMeniu(List<String> ingrediente, int cantitate) {
        return new SupaLegume(ingrediente, cantitate);
    }
}
