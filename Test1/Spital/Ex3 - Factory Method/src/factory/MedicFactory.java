package factory;

import classes.Medic;
import classes.PersonalSpital;

public class MedicFactory implements PersonalFactory{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
