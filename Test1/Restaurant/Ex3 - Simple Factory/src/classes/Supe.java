package classes;

public abstract class Supe {
    private String nume;
    private int cantitate;

    public Supe(String nume, int cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Supe{" +
                "nume='" + nume + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
    public abstract void afisareDetalii();
}
