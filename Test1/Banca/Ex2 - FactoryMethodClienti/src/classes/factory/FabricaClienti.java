package classes.factory;

import classes.clients.Client;

public interface FabricaClienti {
    public Client creareClienti(String nume, int suma);
}
