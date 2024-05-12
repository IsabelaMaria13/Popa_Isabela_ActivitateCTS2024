package classes;

public class Client {
    private String nume;
    private String data;
    private int nrPersoane;

    public Client(String nume, String data, int nrPersoane) {
        this.nume = nume;
        this.data = data;
        this.nrPersoane = nrPersoane;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }
}
