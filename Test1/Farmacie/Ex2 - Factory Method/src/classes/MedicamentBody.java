package classes;

public class MedicamentBody extends Medicamente{
    public MedicamentBody(String nume, int pret) {
        super(nume, pret);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(getDenumire() + " costa: " + getPret());
    }
}
