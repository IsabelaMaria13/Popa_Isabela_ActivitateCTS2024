package classes;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume) {
        this.nume = nume;
        this.modPlata = new CashFarmacie();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void realizarePlata() {
        modPlata.realizarePlata();
    }
}
