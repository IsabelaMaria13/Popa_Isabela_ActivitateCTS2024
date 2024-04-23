package classes;

public abstract class RetetaAbstracta {
    private String ingredient;
    private int cantitate;

    public RetetaAbstracta(String ingredient, int cantitate) {
        this.ingredient = ingredient;
        this.cantitate = cantitate;
    }

    public RetetaAbstracta() {
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "RetetaAbstracta{" +
                "ingredient='" + ingredient + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
    public abstract void afiseazaDetalii();
    public abstract RetetaMedicament clone();
}
