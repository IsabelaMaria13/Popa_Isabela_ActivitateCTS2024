package classes;

public class SupaLegume extends Supe{

    public SupaLegume(String nume, int cantitate) {
        super(nume, cantitate);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(getNume() + " dispobila: " + getCantitate());
    }
}
