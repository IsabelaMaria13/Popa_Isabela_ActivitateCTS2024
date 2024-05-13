package classes;

public class Client {
    private String nume;
    private boolean areCard;
    private int suma;

    public Client(String nume, boolean areCard, int suma) {
        this.nume = nume;
        this.areCard = areCard;
        this.suma = suma;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isAreCard() {
        return areCard;
    }

    public void setAreCard(boolean areCard) {
        this.areCard = areCard;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
}
