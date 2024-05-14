package classes;

public class DisponibilitateMedicamente {

    Medicament medicament;

    public DisponibilitateMedicamente(Medicament medicament) {
        this.medicament = medicament;
    }

    public void verificareDisponibilitate(Medicament medicament) {
        System.out.println("Se verifica disponibilitatea pentru " + medicament.getDenumire());
    }
}
