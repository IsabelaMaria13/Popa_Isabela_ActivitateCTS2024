package classes;

public class InternarePacient implements Internare{
    private String sectie;

    public InternarePacient(String sectie) {
        this.sectie = sectie;
    }

    public String getSectie() {
        return sectie;
    }

    @Override
    public void internare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat cu succes in sectia " + this.sectie);
    }
}
