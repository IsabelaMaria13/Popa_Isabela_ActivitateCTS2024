package classes;

public class MasaRestaurant {
    private int numarLocuri;
    private boolean masaInInterior;
    private State state;

    public State getState() {
        return state;
    }

    protected void setState(State state) {
        this.state = state;
    }

    public MasaRestaurant(int numarLocuri, boolean masaInInterior) {
        this.numarLocuri = numarLocuri;
        this.masaInInterior = masaInInterior;
        this.state = new Libera();
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    public void setNumarLocuri(int numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    public boolean isMasaInInterior() {
        return masaInInterior;
    }

    public void setMasaInInterior(boolean masaInInterior) {
        this.masaInInterior = masaInInterior;
    }

    public void seRezervaMasa() {
        if (this.state instanceof Libera) {
            State rezervata = new Rezervata();
            rezervata.setState(this);
            System.out.println("Masa a fost rezervata!");
        } else {
            System.out.println("Masa nu poate fi rezervata!");
        }
    }

    public void seOcupaMasa() {
        if (this.state instanceof Rezervata) {
            State ocupata = new Ocupata();
            ocupata.setState(this);
            System.out.println("Masa a fost ocupata!");
        } else {
            System.out.println("Masa nu se poate ocupa fara rezervare!");
        }
    }

    public void seElibereazaMasa() {
        if (this.state instanceof Ocupata || this.state instanceof Rezervata) {
            State libera = new Libera();
            libera.setState(this);
            System.out.println("Masa este libera!");
        } else {
            System.out.println("Masa indisponibila momentan!");
        }
    }
}
