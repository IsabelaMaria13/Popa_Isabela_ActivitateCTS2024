package classes;

public class Pacient {
    private String nume;
    private boolean areAsigurareSanatate;

    public String getNume() {
        return nume;
    }

    public boolean isAreAsigurareSanatate() {
        return areAsigurareSanatate;
    }

    public Pacient(String nume, boolean areAsigurareSanatate) {
        this.nume = nume;
        this.areAsigurareSanatate = areAsigurareSanatate;
    }

}
