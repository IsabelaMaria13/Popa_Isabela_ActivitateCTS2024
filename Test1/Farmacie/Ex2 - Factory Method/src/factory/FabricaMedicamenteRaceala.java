package factory;

import classes.MedicamentRaceala;
import classes.Medicamente;

public class FabricaMedicamenteRaceala implements MedicamenteFabrica{
    @Override
    public Medicamente creareMedicament(String denumire, int pret) {
        return new MedicamentRaceala(denumire, pret);
    }
}
