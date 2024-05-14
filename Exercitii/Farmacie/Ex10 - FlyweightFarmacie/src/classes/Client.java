package classes;

public class Client implements Flyweight {
    private String nume;
    private int nrAsigurare;

    public Client(String nume, int nrAsigurare) {
        this.nume = nume;
        this.nrAsigurare = nrAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public int getNrAsigurare() {
        return nrAsigurare;
    }

    @Override
    public void achizitionare(Reteta reteta) {
        System.out.println("Clientul " + getNume() + " a cumparat reteta cu nr " + reteta.getNrReteta() + " in valoare de " +
                reteta.getSuma());
    }
}
