package factory;

import classes.Infirmier;
import classes.PersonalSpital;

public class InfirmierFactory implements PersonalFactory{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Infirmier(nume, salariu);
    }
}
