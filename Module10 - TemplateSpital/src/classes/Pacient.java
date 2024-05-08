package classes;

public class Pacient {
    private String nume;
    private int stareSanatate;

    public String getNume() {
        return nume;
    }

    public int getStareSanatate() {
        return stareSanatate;
    }

    public Pacient(String nume, int stareSanatate) {
        this.nume = nume;
        this.stareSanatate = stareSanatate;
    }

    public void setStareSanatate(int stareSanatate) {
        this.stareSanatate = stareSanatate;
    }
}
