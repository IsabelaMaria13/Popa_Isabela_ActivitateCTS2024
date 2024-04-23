package factory;

import classes.Asistent;
import classes.PersonalSpital;

public class AsistentFactory implements PersonalFactory {

    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}
