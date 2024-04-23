package classes;

import java.util.List;

public class SupaLegume extends Meniu{
    public SupaLegume(List<String> ingrediente, int cantitate) {
        super(ingrediente, cantitate);
    }

    @Override
    public void afisareMeniu() {
        System.out.println("Supa de legume: " + getCantitate() + ": "+ getIngrediente());
    }
}
