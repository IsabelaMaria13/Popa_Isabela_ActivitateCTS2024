package ex2.classes;

import ex2.interfaces.Builder;

public class BicicletaBuilder implements Builder {
    Bicicleta bicicleta = new Bicicleta();
    public BicicletaBuilder setNumeModel(String numeModel) {
        bicicleta.setNumeModel(numeModel);
        return this;
    }

    public BicicletaBuilder setPret(Double pret) {
        bicicleta.setPret(pret);
        return this;
    }

    public BicicletaBuilder setHasCascaProtectie(boolean hasCascaProtectie) {
        bicicleta.setHasCascaProtectie(hasCascaProtectie);
        return this;
    }

    public BicicletaBuilder setHasOchelari(boolean hasOchelari) {
        bicicleta.setHasOchelari(hasOchelari);
        return this;
    }

    public BicicletaBuilder setTipFrana(String tipFrana) {
        bicicleta.setTipFrana(tipFrana);
        return this;
    }
    @Override
    public Bicicleta build() {
        return bicicleta;
    }
}
