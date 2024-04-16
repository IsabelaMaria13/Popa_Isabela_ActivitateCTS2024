package classes;

import classes.clients.Client;
import classes.clients.PersoanaFizica;

public class FabricaPersoaneFizice implements FabricaClienti{
    @Override
    public Client creareClienti(String nume, int suma) {
        return new PersoanaFizica(nume, suma);
    }
}
