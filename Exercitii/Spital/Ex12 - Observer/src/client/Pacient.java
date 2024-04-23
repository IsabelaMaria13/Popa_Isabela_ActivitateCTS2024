package client;

public class Pacient implements Observer {
    private String numePacient;

    public Pacient(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(numePacient + " a primit mesajul urmator: " + mesaj);
    }
}
