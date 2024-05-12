package classes;

public class ProxyInternare implements Internare {
    Internare internare;

    public ProxyInternare(Internare internare) {
        this.internare = internare;
    }

    @Override
    public void internare(Pacient pacient) {
        if (pacient.isAreAsigurareSanatate()) {
            internare.internare(pacient);
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " nu poate fi internat deoarece nu are asigurare de sanatate");
        }
    }
}
