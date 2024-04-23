package classes;

public abstract class Plata {
    private Plata urmatorulCard;

    public Plata getUrmatorulCard() {
        return urmatorulCard;
    }

    public void setUrmatorulCard(Plata urmatorulCard) {
        this.urmatorulCard = urmatorulCard;
    }

    public abstract void plateste(ClientBanca clientBanca, double suma);
}
