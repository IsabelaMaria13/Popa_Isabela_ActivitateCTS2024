package classes;

public class MedicamentDurere extends Medicamente{
    public MedicamentDurere(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(getDenumire() + " costa: " + getPret());
    }
}
