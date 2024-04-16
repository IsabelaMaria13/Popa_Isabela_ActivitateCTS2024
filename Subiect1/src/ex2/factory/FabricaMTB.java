package ex2.factory;

import ex2.classes.MTB;
import ex2.interfaces.FabricaBicicleta;
import ex2.interfaces.IBicicleta;

public class FabricaMTB implements FabricaBicicleta {
    @Override
    public IBicicleta creareBicicleta(String nume, Double pret) {
        return new MTB(nume, pret);
    }
}
