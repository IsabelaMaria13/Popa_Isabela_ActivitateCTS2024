package classes;

public class MedicamentDurere extends Medicament{
    public MedicamentDurere(int pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(getDenumire() + " costa: " + getPret());
    }
}
