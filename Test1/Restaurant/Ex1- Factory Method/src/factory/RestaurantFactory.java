package factory;

import classes.Meniu;

import java.util.List;

public interface RestaurantFactory {
    public Meniu creareMeniu(List<String> ingrediente, int cantitate);
}
