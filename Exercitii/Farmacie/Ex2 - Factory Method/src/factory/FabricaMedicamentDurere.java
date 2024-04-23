package factory;

import classes.MedicamentDurere;
import classes.Medicamente;

public class FabricaMedicamentDurere implements MedicamenteFabrica{

    @Override
    public Medicamente creareMedicament(String denumire, int pret) {
        return new MedicamentDurere(denumire, pret);
    }
}
