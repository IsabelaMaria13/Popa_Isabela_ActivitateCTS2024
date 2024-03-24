package classes;

public class Autobuz extends MijlocTransport{
    public Autobuz(String numarImatriculare, String marca) {
        super(numarImatriculare, marca);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Autobuzul cu numarul de imnmatriculare " + getNumarImatriculare() + ", marca " + getMarca());
    }
}
