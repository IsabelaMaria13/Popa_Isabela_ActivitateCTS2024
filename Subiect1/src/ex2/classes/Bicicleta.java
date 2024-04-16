package ex2.classes;


import ex2.interfaces.IBicicleta;

public class Bicicleta implements IBicicleta {
    private String numeModel;
    private Double pret;
    private boolean hasCascaProtectie;
    private boolean hasOchelari;
    private String tipFrana;

    public Bicicleta() {
        this.numeModel = "N/A";
        this.pret = 0.0;
        this.hasCascaProtectie = false;
        this.hasOchelari = false;
        this.tipFrana = "N/A";
    }

    public Bicicleta(String numeModel, Double pret, boolean hasCascaProtectie, boolean hasOchelari, String tipFrana) {
        this.numeModel = numeModel;
        this.pret = pret;
        this.hasCascaProtectie = hasCascaProtectie;
        this.hasOchelari = hasOchelari;
        this.tipFrana = tipFrana;
    }
    void setNumeModel(String numeModel) {
        this.numeModel = numeModel;
    }

    void setPret(Double pret) {
        this.pret = pret;
    }

    void setHasCascaProtectie(boolean hasCascaProtectie) {
        this.hasCascaProtectie = hasCascaProtectie;
    }

    void setHasOchelari(boolean hasOchelari) {
        this.hasOchelari = hasOchelari;
    }

    void setTipFrana(String tipFrana) {
        this.tipFrana = tipFrana;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Bicileta "+this.numeModel+" este la pretul de "+this.pret+" "+this.tipFrana+" "+this.hasOchelari+" "+this.hasCascaProtectie);
    }
}
