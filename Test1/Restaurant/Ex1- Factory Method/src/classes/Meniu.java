package classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Meniu {
    private List<String> ingrediente;
    private int cantitate;

    public Meniu(List<String> ingrediente, int cantitate) {
        this.ingrediente = ingrediente;
        this.cantitate = cantitate;
    }

    public List<String> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<String> ingrediente) {
        this.ingrediente = new ArrayList<>();
        for (String ingredient: ingrediente){
            this.ingrediente.add(ingredient);
        }
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "ingrediente=" + ingrediente +
                ", cantitate=" + cantitate +
                '}';
    }

    public abstract void afisareMeniu();
}
