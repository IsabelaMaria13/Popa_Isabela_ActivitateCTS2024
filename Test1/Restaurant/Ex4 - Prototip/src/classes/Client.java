package classes;

public class Client implements ClientExistent{
    private String nume;
    private String numarTelefon;

    public Client(String nume, String numarTelefon) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
    }

    public Client() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                '}';
    }

    @Override
    public Client clone() {
        Client clientExistent = new Client();
        clientExistent.setNumarTelefon(this.getNumarTelefon());
        clientExistent.setNume(this.getNume());
        return clientExistent;
    }
}
