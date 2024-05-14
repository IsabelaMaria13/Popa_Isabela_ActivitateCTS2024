package classes;

public class Adapter implements Vanzare {
    private GestiuneStocuri gestiuneStocuri;
    int id;

    public Adapter(GestiuneStocuri gestiuneStocuri) {
        this.gestiuneStocuri = gestiuneStocuri;
    }

    @Override
    public void setareMedicament(int id) {
        this.id = id;
    }

    @Override
    public boolean verificareDisponibilitate(int nrBucati) {
        return gestiuneStocuri.verificaStocPentruMedicament(this.id, nrBucati);
    }
}
