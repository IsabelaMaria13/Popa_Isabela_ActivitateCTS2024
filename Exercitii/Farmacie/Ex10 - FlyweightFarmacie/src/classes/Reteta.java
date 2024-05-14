package classes;

public class Reteta {
    private int nrReteta;
    private int suma;
    private int nrMedicamente;

    public Reteta(int nrReteta, int suma, int nrMedicamente) {
        this.nrReteta = nrReteta;
        this.suma = suma;
        this.nrMedicamente = nrMedicamente;
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public int getSuma() {
        return suma;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }
}
