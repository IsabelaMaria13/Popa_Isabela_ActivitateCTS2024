package classes;

public class MasaRestaurant {
    private int numarLocuri;
    private boolean masaInInterior;
    public MasaRestaurant(int numarLocuri, boolean masaInInterior) {
        this.numarLocuri = numarLocuri;
        this.masaInInterior = masaInInterior;
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

}
