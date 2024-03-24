package classes;

public class Trolebuz extends MijlocTransport{
    public Trolebuz(String numarImatriculare, String marca) {
        super(numarImatriculare, marca);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Trolebuzul cu numarul de imnmatriculare " + getNumarImatriculare() + ", marca " + getMarca());
    }
}
