package classes.Decorator;

import classes.Spital.DiagnosticAbs;

public class AplicatieOnline extends Decorator {

    public AplicatieOnline(DiagnosticAbs diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afisareOnline() {
        System.out.println("Rezultatele disponibile in aplicatia mobila sunt: " + diagnostic.getNumeDiagnostic() +
                " prezinta simptomele " + diagnostic.getSimptome() +
                " si " + ( diagnostic.isNecesitaSpitalizare() ? " necesita spitalizare" : " nu necesita spitalizare" ));
    }

    @Override
    public String getNumeDiagnostic() {
        return diagnostic.getNumeDiagnostic();
    }

    @Override
    public String getSimptome() {
        return diagnostic.getSimptome();
    }

    @Override
    public boolean isNecesitaSpitalizare() {
        return diagnostic.isNecesitaSpitalizare();
    }
}
