package ex2.classes;

import ex2.interfaces.IBicicleta;

public class MTB implements IBicicleta {
    private String numeModel;
    private Double pret;

    public MTB(String numeModel, Double pret) {
        this.numeModel = numeModel;
        this.pret = pret;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Modelul MTB "+this.numeModel+" la pretul "+this.pret);
    }

}
