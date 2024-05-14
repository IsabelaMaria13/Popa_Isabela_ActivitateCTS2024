package observer;

public class Abonat implements Observer {
    private String nume;

    public Abonat(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume + " a fost notificat: " + mesaj);
    }
}
