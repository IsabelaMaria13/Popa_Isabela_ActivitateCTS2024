package classes;

public class MedicamentBody extends Medicament {
    public MedicamentBody(int pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(getDenumire() + " costa: " + getPret());
    }
}
