package classes;

public abstract class Template {

    public final void vanzare(String denumire, int nrBucati) {
        sePrimesteReteta();
        if (seVerificaStoculInSistem(nrBucati, denumire)) {
            seMergeInDepozit();
            seAducMedicamente();
            seIncaseazaBani();
            seScadeDinStoc(denumire, nrBucati);
            seEmiteBonul();
        } else {
            seFaceAchizitieDeMedicamente(denumire);
            seAducMedicamenteDeLaFurnizori(denumire);
        }

    }
    public abstract void adaugaMedicament(Medicament medicament);

    public abstract Medicament getMedicament(String denumire);
    public abstract void sePrimesteReteta();

    public abstract boolean seVerificaStoculInSistem(int nrBucati, String denumire);

    public abstract void seMergeInDepozit();

    public abstract void seAducMedicamente();

    public abstract void seFaceAchizitieDeMedicamente(String denumire);

    public abstract void seAducMedicamenteDeLaFurnizori(String denumire);

    public abstract void seIncaseazaBani();

    public abstract void seScadeDinStoc(String denumire,int nrBucati);

    public abstract void seEmiteBonul();
}
