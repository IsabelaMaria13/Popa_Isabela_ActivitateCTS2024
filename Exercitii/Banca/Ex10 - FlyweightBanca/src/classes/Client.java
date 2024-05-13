package classes;

public class Client implements IFlyweight {
    private String nume;
    private String adresa;
    private String nrTelefon;
    private String email;

    public Client(String nume, String adresa, String nrTelefon, String email) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void creareCont(Cont cont) {
        System.out.println("Cont creat cu succes! Client " + this.nume + " cont numarul " + cont.getNrCont());
    }
}
