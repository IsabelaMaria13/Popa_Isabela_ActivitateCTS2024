package factory;


import classes.MijlocTransport;

public abstract class FabricaMijlocTransport
{
    public abstract MijlocTransport creareMijlocTransport(String numar, String marca);
}
