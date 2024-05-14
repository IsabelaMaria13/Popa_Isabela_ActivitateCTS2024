package classes;

public class Medicament {
    private String denumire;
    private int disponibilitate;

    public Medicament(String denumire, int disponibilitate) {
        this.denumire = denumire;
        this.disponibilitate = disponibilitate;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getDisponibilitate() {
        return disponibilitate;
    }

}
