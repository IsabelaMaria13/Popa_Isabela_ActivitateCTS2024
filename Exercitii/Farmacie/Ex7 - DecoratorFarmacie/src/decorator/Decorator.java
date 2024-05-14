package decorator;

import classes.IBonDeCasa;

public abstract class Decorator implements IBonDeCasa {
    IBonDeCasa bonDeCasa;

    public Decorator(IBonDeCasa bonDeCasa) {
        this.bonDeCasa = bonDeCasa;
    }

    @Override
    public void printeazaBon() {
        bonDeCasa.printeazaBon();
        System.out.println("La multi ani!");
    }
}
