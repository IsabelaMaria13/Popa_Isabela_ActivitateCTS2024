package classes;

public class MedicamentRaceala extends Medicament{

    public MedicamentRaceala(int pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(getDenumire() + " costa: " + getPret());
    }
}
