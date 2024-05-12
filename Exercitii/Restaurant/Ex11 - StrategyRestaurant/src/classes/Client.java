package classes;

public class Client {
    private String nume;
    private ModalitatePlata modalitatePlata;

    public Client(String nume) {
        this.nume = nume;
        this.modalitatePlata = new Cash();
    }

    public String getNume() {
        return nume;
    }

    public void setModalitatePlata(ModalitatePlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public void plateste() {
        modalitatePlata.plateste(this);
    }
}
