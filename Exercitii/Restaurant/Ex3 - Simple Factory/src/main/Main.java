package main;
import classes.Supe;
import factory.MeniuFactory;
import factory.TipSupa;

public class Main {
    public static void main(String[] args) throws Exception{
        MeniuFactory meniuFactory =  new MeniuFactory();
        Supe supaCiuperci = meniuFactory.creareMeniu(TipSupa.Supa_de_ciuperci, "Supa de ciuperci", 15);
        supaCiuperci.afisareDetalii();
    }
}