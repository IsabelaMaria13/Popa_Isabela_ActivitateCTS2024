package classes;

import java.util.ArrayList;
import java.util.List;

public class Farmacie extends Template {
    List<Medicament> medicamente;

    public Farmacie() {
        this.medicamente = new ArrayList<>();
    }

    @Override
    public void adaugaMedicament(Medicament medicament) {
        medicamente.add(medicament);
    }

    @Override
    public Medicament getMedicament(String denumire) {
        for (Medicament medicament : medicamente) {
            if (medicament.getDenumire().equals(denumire)) {
                return medicament;
            }
        }
        return new Medicament("Parasinus", 30, 0);
    }

    @Override
    public void sePrimesteReteta() {
        System.out.println("Se verifica reteta...");
    }

    @Override
    public boolean seVerificaStoculInSistem(int nrBucati, String denumire) {
        Medicament medicament = getMedicament(denumire);
        if (medicament.getNrBucati() >= nrBucati) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void seMergeInDepozit() {
        System.out.println("Se merge in depozit pentru a se aduce medicamentul..");
    }

    @Override
    public void seAducMedicamente() {
        System.out.println("S-au adus medicamentele.");

    }

    @Override
    public void seFaceAchizitieDeMedicamente(String denumire) {
        Medicament medicament = getMedicament(denumire);
        System.out.println("Medicamentul " + medicament.getDenumire() +
                " a fost cumparat de la furnizori cu pretul de " + medicament.getPret());
    }

    @Override
    public void seAducMedicamenteDeLaFurnizori(String denumire) {
        System.out.println("S-a realizat comanda pentru medicamentul: " + denumire);

    }

    @Override
    public void seIncaseazaBani() {
        System.out.println("Bani incasati");
    }

    @Override
    public void seScadeDinStoc(String denumire, int nrBucati) {
        Medicament medicament = getMedicament(denumire);
        medicament.setNrBucati(medicament.getNrBucati() - nrBucati);
        System.out.println("S-a realizat scaderea stocului. Numar disponibil de bucati acum " + medicament.getNrBucati());
    }

    @Override
    public void seEmiteBonul() {
        System.out.println("Bon emis");

    }
}
