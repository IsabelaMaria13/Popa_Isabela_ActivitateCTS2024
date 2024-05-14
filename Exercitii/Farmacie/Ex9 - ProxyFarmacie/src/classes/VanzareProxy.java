package classes;

public class VanzareProxy implements Vanzare {
    Vanzare vanzare;

    public VanzareProxy(Vanzare vanzare) {
        this.vanzare = vanzare;
    }

    @Override
    public void vanzareMedicament(Client client) {
        if (client.isAreReteta()) {
            vanzare.vanzareMedicament(client);
        } else {
            System.out.println("Ne cerem scuze insa medicamentul se elibereaza numai pe baza de reteta.");
        }
    }
}
