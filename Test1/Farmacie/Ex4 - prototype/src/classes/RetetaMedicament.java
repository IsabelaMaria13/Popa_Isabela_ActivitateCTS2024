package classes;

public class RetetaMedicament extends RetetaAbstracta{

    public RetetaMedicament(String ingredient, int cantitate) {
        super(ingredient, cantitate);
    }

    public RetetaMedicament() {
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Medicamentul contine: "+ getIngredient() + " in cantitatea de " + getCantitate() + "mg");
    }

    @Override
    public RetetaMedicament clone() {
        RetetaMedicament retetaMedicament = new RetetaMedicament();
        retetaMedicament.setCantitate(this.getCantitate());
        retetaMedicament.setIngredient(this.getIngredient());
        return  retetaMedicament;
    }
}
