package factory;

import classes.Meniu;
import classes.SupaCiuperci;

import java.util.List;

public class SupaCiuperciFactory implements RestaurantFactory{

    @Override
    public Meniu creareMeniu(List<String> ingrediente, int cantitate) {
        return new SupaCiuperci(ingrediente, cantitate);
    }
}
