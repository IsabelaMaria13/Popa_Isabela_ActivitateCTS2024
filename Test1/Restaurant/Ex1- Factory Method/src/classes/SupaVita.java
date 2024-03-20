package classes;

import java.util.List;

public class SupaVita extends Meniu{
    public SupaVita(List<String> ingrediente, int cantitate) {
        super(ingrediente, cantitate);
    }

    @Override
    public void afisareMeniu() {
        System.out.println("Supa de vita: " + getCantitate() + ": "+ getIngrediente());

    }
}
