package classes;

import java.util.List;

public class SupaCiuperci extends Meniu {
    public SupaCiuperci(List<String> ingrediente, int cantitate) {
        super(ingrediente, cantitate);
    }

    @Override
    public void afisareMeniu() {
        System.out.println("Supa de ciuperci: " + getCantitate() + ": "+ getIngrediente());
    }
}
