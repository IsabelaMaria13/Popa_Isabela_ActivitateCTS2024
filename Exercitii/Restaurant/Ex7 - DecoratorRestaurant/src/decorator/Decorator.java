package decorator;

import classes.INotaDePlata;
import classes.NotaDePlata;

public abstract class Decorator implements INotaDePlata {
    NotaDePlata notaDePlata;

    public Decorator(NotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeazaNota() {
        notaDePlata.printeazaNota();
        System.out.println("La multi ani!");
    }
}
