package classes.Spital;

public class Diagnostic implements DiagnosticAbs{
    private String numeDiagnostic;
    private String simptome;
    private boolean necesitaSpitalizare;

    public Diagnostic(String numeDiagnostic, String simptome, boolean necesitaSpitalizare) {
        this.numeDiagnostic = numeDiagnostic;
        this.simptome = simptome;
        this.necesitaSpitalizare = necesitaSpitalizare;
    }


    @Override
    public String getNumeDiagnostic() {
        return this.numeDiagnostic;
    }

    @Override
    public String getSimptome() {
        return this.simptome;
    }

    @Override
    public boolean isNecesitaSpitalizare() {
        return this.necesitaSpitalizare;
    }

    @Override
    public void printeazaDiagnostic() {
        System.out.println("Nume diagnostic: " + this.numeDiagnostic + " are simptomele " + this.simptome
                + ( this.necesitaSpitalizare ? " necesita spitalizare" : " nu necesita spitalizare" ) );
    }


}
