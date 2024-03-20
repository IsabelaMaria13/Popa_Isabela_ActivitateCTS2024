package factory;

import classes.PersonalSpital;

public interface PersonalFactory {

    public PersonalSpital createPersonal(String nume, int salariu);
}
