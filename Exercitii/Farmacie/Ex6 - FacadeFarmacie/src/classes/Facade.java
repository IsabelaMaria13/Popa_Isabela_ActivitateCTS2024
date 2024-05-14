package classes;

public class Facade {
    public void vanzareMedicament(Medicament medicament) {
        VerificareReteta verificareReteta = new VerificareReteta();
        verificareReteta.verificareReteta();

        DisponibilitateMedicamente disponibilitateMedicamente = new DisponibilitateMedicamente(medicament);
        disponibilitateMedicamente.verificareDisponibilitate(medicament);

        VerificareCardSanatate verificareCardSanatate = new VerificareCardSanatate();
        verificareCardSanatate.verificareCardSanatate();
    }
}
