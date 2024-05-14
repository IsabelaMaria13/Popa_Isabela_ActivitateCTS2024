package classes;

public class AplicatieVanzare implements Vanzare {
    Medicament medicament;

    public AplicatieVanzare(Medicament medicament) {
        this.medicament = medicament;
    }

    @Override
    public void setareMedicament(int id) {
        if (medicament.getId() == id) {
            System.out.println("Medicament gasit");
        } else {
            System.out.println("Medicament indisponibil.");
        }
    }

    @Override
    public boolean verificareDisponibilitate(int nrBucati) {
        if (medicament.getDisponibilitate() >= nrBucati) {
            return true;
        } else {
            return false;
        }
    }
}
