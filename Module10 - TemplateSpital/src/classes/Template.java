package classes;

public abstract class Template {
    public final void internare(Pacient pacient) {
        analizaSanatate(pacient);
        if (disponibilitateSalon() > 0) {
            emitereFisa(pacient);
        } else {
            refuzInternare(pacient);
        }

    }

    protected abstract void analizaSanatate(Pacient pacient);

    protected abstract int disponibilitateSalon();

    protected abstract void emitereFisa(Pacient pacient);

    protected abstract void refuzInternare(Pacient pacient);
}
