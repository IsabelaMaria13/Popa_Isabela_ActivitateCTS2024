package factory;

import classes.MedicamentBody;
import classes.Medicamente;

public class FabricaMedicamenteBody implements MedicamenteFabrica{
    @Override
    public Medicamente creareMedicament(String denumire, int pret) {
        return new MedicamentBody(denumire, pret);
    }
}
