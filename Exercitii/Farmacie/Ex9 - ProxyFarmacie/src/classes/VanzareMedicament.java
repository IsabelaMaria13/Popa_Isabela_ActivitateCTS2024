package classes;

public class VanzareMedicament implements Vanzare {
    @Override
    public void vanzareMedicament(Client client) {
        System.out.println("Medicamentul este disponibil pentru clientul " + client.getNume() + " si a fost vandut.");
    }
}
