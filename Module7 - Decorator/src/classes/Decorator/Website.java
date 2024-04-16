package classes.Decorator;

import classes.Spital.DiagnosticAbs;

public class Website extends Decorator{
    public Website(DiagnosticAbs diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afisareOnline() {
        System.out.println("Buna ziua! Reultatele invetigatiilor dvs. sunt gata! Pentru diagnosticul:  " + diagnostic.getNumeDiagnostic() +
                " cu simptomele " + diagnostic.getSimptome() +
                 ( diagnostic.isNecesitaSpitalizare() ? " aveti nevoie de spitalizare" : " nu aveti nevoie de spitalizare" ));

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
