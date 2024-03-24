package classes;

public abstract class MijlocTransport {
    String numarImatriculare;
    String marca;

    public MijlocTransport(String numarImatriculare, String marca) {
        this.numarImatriculare = numarImatriculare;
        this.marca = marca;
    }

    public String getNumarImatriculare() {
        return numarImatriculare;
    }

    public void setNumarImatriculare(String numarImatriculare) {
        this.numarImatriculare = numarImatriculare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "MijlocTransport{" +
                "numarImatriculare='" + numarImatriculare + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
    public abstract void afiseazaDetalii();
}
