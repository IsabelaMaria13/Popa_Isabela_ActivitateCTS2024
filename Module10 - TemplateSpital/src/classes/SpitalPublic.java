package classes;

public class SpitalPublic extends Template {
    private String numeSpital;
    private int nrPaturiLibere;

    public SpitalPublic(String numeSpital, int nrPaturiLibere) {
        this.numeSpital = numeSpital;
        this.nrPaturiLibere = nrPaturiLibere;
    }

    @Override
    protected void analizaSanatate(Pacient pacient) {
        pacient.setStareSanatate((pacient.getNume().length() % 5) + 1);
        System.out.println("Pacientul " + pacient.getNume() + " are starea: " + pacient.getStareSanatate());
    }

    @Override
    protected int disponibilitateSalon() {
        return this.nrPaturiLibere;
    }

    @Override
    protected void emitereFisa(Pacient pacient) {
        this.nrPaturiLibere--;
        System.out.println("Pacientul " + pacient.getNume() + " este internat in spitalul " + this.numeSpital);
    }

    @Override
    protected void refuzInternare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " este trimis in alt spital, deoarece inn spitalul " + this.numeSpital + " nu avem suficiente locuri.");
    }
}
