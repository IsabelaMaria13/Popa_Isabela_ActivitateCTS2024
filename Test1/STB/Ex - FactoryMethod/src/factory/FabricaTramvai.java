package factory;

import classes.MijlocTransport;
import classes.Tramvai;

public class FabricaTramvai extends FabricaMijlocTransport{
    @Override
    public MijlocTransport creareMijlocTransport(String numar, String marca) {
        return new Tramvai(numar, marca);
    }
}
