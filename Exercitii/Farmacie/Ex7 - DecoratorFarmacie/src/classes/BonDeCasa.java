package classes;

public class BonDeCasa implements IBonDeCasa {
    private String client;
    private double suma;

    public BonDeCasa(String client, double suma) {
        this.client = client;
        this.suma = suma;
    }

    @Override
    public void printeazaBon() {
        System.out.println("Bon printat pentru clientul " + this.client + " in valoare de " + this.suma);
    }
}
