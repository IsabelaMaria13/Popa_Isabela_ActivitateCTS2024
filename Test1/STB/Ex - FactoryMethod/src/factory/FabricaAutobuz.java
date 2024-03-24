package factory;

import classes.Autobuz;
import classes.MijlocTransport;

public class FabricaAutobuz extends FabricaMijlocTransport
{
    @Override
    public MijlocTransport creareMijlocTransport(String numar, String marca) {
        return new Autobuz(numar, marca);
    }
}
