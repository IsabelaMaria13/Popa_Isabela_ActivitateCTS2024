package classes.factory;

import classes.clients.Client;
import classes.clients.PersoanaJuridica;

public class FabricaPersoaneJuridice implements FabricaClienti{
    @Override
    public Client creareClienti(String nume, int suma) {
        return new PersoanaJuridica(nume, suma);
    }
}
