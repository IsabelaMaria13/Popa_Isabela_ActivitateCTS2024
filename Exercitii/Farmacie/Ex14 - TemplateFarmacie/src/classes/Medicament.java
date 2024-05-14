package classes;

public class Medicament {
    private String denumire;
    private int pret;
    private int nrBucati;

    public Medicament(String denumire, int pret, int nrBucati) {
        this.denumire = denumire;
        this.pret = pret;
        this.nrBucati = nrBucati;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getPret() {
        return pret;
    }

    public int getNrBucati() {
        return nrBucati;
    }

    public void setNrBucati(int nrBucati) {
        this.nrBucati = nrBucati;
    }
}
