package classes.Main;

import classes.Decorator.AplicatieOnline;
import classes.Decorator.Decorator;
import classes.Decorator.Website;
import classes.Spital.Diagnostic;
import classes.Spital.DiagnosticAbs;

public class Main {
    public static void main(String[] args) {
        DiagnosticAbs diagnostic = new Diagnostic("Pneumonie", "Tuse seaca, dureri in piept", false);
        diagnostic.printeazaDiagnostic();

        Decorator mobile = new AplicatieOnline(diagnostic);
        mobile.afisareOnline();
        mobile.printeazaDiagnostic();

        Decorator website = new Website(diagnostic);
        website.afisareOnline();
        website.printeazaDiagnostic();

    }
}