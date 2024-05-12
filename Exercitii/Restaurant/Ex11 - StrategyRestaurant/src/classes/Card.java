package classes;

public class Card implements ModalitatePlata {
    @Override
    public void plateste(Client client) {
        System.out.println("Clientul " + client.getNume() + " a platit card.");
    }
}
