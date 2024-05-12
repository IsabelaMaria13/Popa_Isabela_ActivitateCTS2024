package classes;

public class Cash implements ModalitatePlata {
    @Override
    public void plateste(Client client) {
        System.out.println("Clientul " + client.getNume() + " a platit cash.");
    }
}
