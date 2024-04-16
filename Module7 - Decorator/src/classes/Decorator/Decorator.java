package classes.Decorator;

import classes.Spital.DiagnosticAbs;

public abstract class Decorator implements DiagnosticAbs {
    protected DiagnosticAbs diagnostic;

    public Decorator(DiagnosticAbs diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public void printeazaDiagnostic() {
        diagnostic.printeazaDiagnostic();
        System.out.println("Rezultatul este disponibil si pe platforma");

    }

    public abstract void afisareOnline();
}
