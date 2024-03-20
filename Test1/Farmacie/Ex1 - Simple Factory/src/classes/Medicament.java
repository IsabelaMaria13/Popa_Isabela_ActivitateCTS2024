package classes;

public abstract class Medicament {
    private int pret;
    private String denumire;

    public Medicament(int pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "pret=" + pret +
                ", denumire='" + denumire + '\'' +
                '}';
    }
    public abstract void afisareDetalii();
}
