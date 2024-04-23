package factory;

import classes.Medicament;
import classes.MedicamentBody;
import classes.MedicamentDurere;
import classes.MedicamentRaceala;

public class FabricaMedicamente {
    public Medicament creareaMedicament(TipMedicament tipMedicament, String denumire, int pret) throws Exception{
        switch (tipMedicament){
            case body -> {
                return new MedicamentBody(pret, denumire);
            }
            case raceala -> {
                return new MedicamentRaceala(pret, denumire);
            }
            case durere -> {
                return new MedicamentDurere(pret, denumire);
            }
            default -> throw new Exception("Medicament inexistent");
        }
    }
}
