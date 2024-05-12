package classes;

public class RezervarePrinProxy implements Rezervare{
    RezervareClient rezervareClient;

    public RezervarePrinProxy(RezervareClient rezervareClient) {
        this.rezervareClient = rezervareClient;
    }

    public RezervareClient getRezervareClient() {
        return rezervareClient;
    }

    public void setRezervareClient(RezervareClient rezervareClient) {
        this.rezervareClient = rezervareClient;
    }

    @Override
    public void rezervaMasa(Client client) {
        if(client.getNrPersoane() >= 4){
            rezervareClient.rezervaMasa(client);
        }
        else{
            System.out.println("Ne cerem scuze insa acceptam doar rezervari de minim 4 persoane")    ;
        }
    }
}
