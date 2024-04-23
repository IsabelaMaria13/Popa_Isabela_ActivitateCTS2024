package classes;

public class Pacient {
    private String nume;
    private ModPlata modPlata;

    public Pacient(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public Pacient(String nume) {
        this.nume = nume;
        this.modPlata = new Cash();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(double sumaDePlata){
        modPlata.plateste(this.nume, sumaDePlata);
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", modPlata=" + modPlata +
                '}';
    }
}
