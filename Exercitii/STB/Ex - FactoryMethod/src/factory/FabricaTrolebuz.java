package factory;

import classes.MijlocTransport;
import classes.Trolebuz;

public class FabricaTrolebuz extends FabricaMijlocTransport{
    @Override
    public MijlocTransport creareMijlocTransport(String numar, String marca) {
        return new Trolebuz(numar, marca);
    }
}
