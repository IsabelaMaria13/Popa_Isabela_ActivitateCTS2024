package classes;

public class Farmacie {
    private Vanzare vanzare;

    public Farmacie(Vanzare vanzare) {
        this.vanzare = vanzare;
    }

    public void efectueazaVanzare(int id, int nrBuc) {
        vanzare.setareMedicament(id);
        if (vanzare.verificareDisponibilitate(nrBuc)) {
            System.out.println("Medicamentele sunt disponibile. Vânzare efectuată.");
        } else {
            System.out.println("Medicamentele nu sunt disponibile. Vânzare eșuată.");
        }
    }
}
