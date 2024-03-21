package classes.clients;

public abstract class Client {
    String nume;
    int sumaCont;

    public Client(String nume, int sumaCont) {
        this.nume = nume;
        this.sumaCont = sumaCont;
    }

    public Client() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSumaCont() {
        return sumaCont;
    }

    public void setSumaCont(int sumaCont) {
        this.sumaCont = sumaCont;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", sumaCont=" + sumaCont +
                '}';
    }
    public abstract void afiseazaDetalii();

}
