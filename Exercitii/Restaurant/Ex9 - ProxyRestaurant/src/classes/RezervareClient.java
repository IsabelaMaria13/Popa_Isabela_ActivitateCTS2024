package classes;

public class RezervareClient implements Rezervare {
    private boolean realizeazaRezervare;

    public RezervareClient(boolean realizeazaRezervare) {
        this.realizeazaRezervare = realizeazaRezervare;
    }

    public boolean isRealizeazaRezervare() {
        return realizeazaRezervare;
    }

    public void setRealizeazaRezervare(boolean realizeazaRezervare) {
        this.realizeazaRezervare = realizeazaRezervare;
    }

    @Override
    public void rezervaMasa(Client client) {
        System.out.println("Clientul " + client.getNume() + " a realizat o rezervare in data de " +
                client.getData() + " pentru " + client.getNrPersoane() + " persoane");
    }
}
