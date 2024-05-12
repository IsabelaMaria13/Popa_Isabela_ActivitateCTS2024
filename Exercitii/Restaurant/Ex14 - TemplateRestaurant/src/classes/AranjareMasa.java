package classes;

public class AranjareMasa extends Template {
    private String client;
    private boolean masaRezervata;

    public AranjareMasa(String client, boolean masaRezervata) {
        this.client = client;
        this.masaRezervata = masaRezervata;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public boolean isMasaRezervata() {
        return masaRezervata;
    }

    public void setMasaRezervata(boolean masaRezervata) {
        this.masaRezervata = masaRezervata;
    }

    @Override
    protected void seCurataMasa(MasaRestaurant masa) {
        System.out.println("Masa de " + masa.getNumarLocuri() +
                " a fost curatata!");
    }

    @Override
    protected void seAseazaServetele(MasaRestaurant masa) {
        if (this.isMasaRezervata()) {
            System.out.println("Au fost aranjate servetelele");
        } else {
            System.out.println("Masa nu este rezervata pentru a fi aranjate servetelele!");
        }
    }

    @Override
    protected void seAseazaTacamurile(MasaRestaurant masa) {
        if (this.isMasaRezervata()) {
            System.out.println("Au fost aranjate tacamurile");
        } else {
            System.out.println("Masa nu este rezervata pentru a fi aranjate tacamurile!");
        }
    }

    @Override
    protected void seInvitaPersoanele(MasaRestaurant masa) {
        if (this.isMasaRezervata()) {
            System.out.println("Au fost invitate persoanele");
        } else {
            System.out.println("Masa nu este rezervata pentru a fi invitate persoanele!");
        }
    }
}
