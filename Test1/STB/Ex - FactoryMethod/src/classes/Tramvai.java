package classes;

public class Tramvai extends MijlocTransport{
    public Tramvai(String numarImatriculare, String marca) {
        super(numarImatriculare, marca);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Tramvaiul cu numarul de imnmatriculare " + getNumarImatriculare() + ", marca " + getMarca());
    }
}
