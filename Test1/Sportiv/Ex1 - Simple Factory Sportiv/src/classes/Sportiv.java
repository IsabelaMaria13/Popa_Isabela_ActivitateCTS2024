package classes;

public abstract class Sportiv {
    private String nume;
    private int numar;

    public Sportiv(String nume, int numar) {
        this.nume = nume;
        this.numar = numar;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    @Override
    public String toString() {
        return "Sportiv{" +
                "nume='" + nume + '\'' +
                ", numar=" + numar +
                '}';
    }
    public abstract void afiseazaDetalii();
}
