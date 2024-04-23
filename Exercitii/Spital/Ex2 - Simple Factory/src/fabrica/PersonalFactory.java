package fabrica;

import classes.Asistent;
import classes.Brancardier;
import classes.Medic;
import classes.PersonalSpital;

public class PersonalFactory {

    public PersonalSpital createPesonal(TipPersonal tipPersonal, String nume, int salariu) throws Exception {
        switch (tipPersonal) {
            case medic:
                return new Medic(nume, salariu);
            case asistent:
                return new Asistent(nume, salariu);
            case brancardier:
                return new Brancardier(nume, salariu);
            default:
                throw new Exception("Tipul nu este potrivit");
        }
    }
}
