package classes;

public class MedicamentRaceala extends Medicamente{

    public MedicamentRaceala(String nume, int pret) {
        super(nume, pret);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(getDenumire() + " costa: " + getPret());
    }
}
