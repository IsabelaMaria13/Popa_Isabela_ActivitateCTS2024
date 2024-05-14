package main;

import classes.BonDeCasa;
import classes.IBonDeCasa;
import decorator.BonDecorat;
import decorator.Decorator;

public class Main {
    public static void main(String[] args) {
        IBonDeCasa bonDeCasa = new BonDeCasa("Razvan", 300);

        bonDeCasa.printeazaBon();

        Decorator decorator = new BonDecorat(bonDeCasa);
        decorator.printeazaBon();


    }
}