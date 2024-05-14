package decorator;

import classes.BonDeCasa;
import classes.IBonDeCasa;

public class BonDecorat extends Decorator{
    public BonDecorat(IBonDeCasa bonDeCasa) {
        super(bonDeCasa);
    }
}
