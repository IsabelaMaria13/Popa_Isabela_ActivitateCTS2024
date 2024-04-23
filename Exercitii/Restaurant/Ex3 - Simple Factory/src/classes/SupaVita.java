package classes;

public class SupaVita extends Supe{
    public SupaVita(String nume, int cantitate) {
        super(nume, cantitate);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(getNume() + " dispobila: " + getCantitate());
    }
}
