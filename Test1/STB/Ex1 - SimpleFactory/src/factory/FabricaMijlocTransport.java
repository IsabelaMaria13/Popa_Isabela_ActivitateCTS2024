package factory;

import classes.Autobuz;
import classes.MijlocTransport;
import classes.Tramvai;
import classes.Trolebuz;

public class FabricaMijlocTransport
{
    public MijlocTransport creareMijlocTransport(TipMijlocTransport tipMijlocTransport, String numar, String marca) throws Exception{
        switch (tipMijlocTransport){
            case Autobuz -> {
                return new Autobuz(numar, marca);
            }
            case Tramvai -> {
                return new Tramvai(numar, marca);
            }
            case Trolebuz -> {
                return new Trolebuz(numar, marca);
            }
            default -> throw new Exception("Nu exista tipul de mijloc de transport!");
        }
    }
}
