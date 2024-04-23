package classes;

public class ClientBanca {
    private String nume;
    private int sumaPlata;

    public ClientBanca(String nume, int sumaPlata) {
        this.nume = nume;
        this.sumaPlata = sumaPlata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSumaPlata() {
        return sumaPlata;
    }

    public void setSumaPlata(int sumaPlata) {
        this.sumaPlata = sumaPlata;
    }

    @Override
    public String toString() {
        return "ClientBanca{" +
                "nume='" + nume + '\'' +
                ", sumaPlata=" + sumaPlata +
                '}';
    }
}
