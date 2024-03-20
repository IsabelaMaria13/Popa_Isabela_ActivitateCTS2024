package classes;

public class SupaCiuperci extends Supe{
    public SupaCiuperci(String nume, int cantitate) {
        super(nume, cantitate);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(getNume() + " dispobila: " + getCantitate());
    }
}
