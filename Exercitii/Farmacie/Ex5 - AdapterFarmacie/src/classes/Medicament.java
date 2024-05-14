package classes;

public class Medicament {
    private int id;
    private String denumire;
    private int disponibilitate;
    private String afectiune;

    public Medicament(int id, String denumire, int disponibilitate, String afectiune) {
        this.id = id;
        this.denumire = denumire;
        this.afectiune = afectiune;
        this.disponibilitate = disponibilitate;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getDisponibilitate() {
        return disponibilitate;
    }

    public String getAfectiune() {
        return afectiune;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Medicament{" +
                "denumire='" + denumire + '\'' +
                ", afectiune='" + afectiune + '\'' +
                '}';
    }
}
