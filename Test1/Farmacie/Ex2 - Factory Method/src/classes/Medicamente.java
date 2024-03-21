package classes;

public abstract class Medicamente {
    private String denumire;
    private int pret;

    public Medicamente() {
    }

    public Medicamente(String nume, int pret) {
        this.denumire = nume;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Medicamente{" +
                "nume='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
    public abstract void afiseazaDetalii();
}



