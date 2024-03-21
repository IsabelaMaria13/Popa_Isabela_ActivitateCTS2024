package factory;

import classes.Medicamente;

public interface MedicamenteFabrica {
    public Medicamente creareMedicament(String denumire, int pret);
}
