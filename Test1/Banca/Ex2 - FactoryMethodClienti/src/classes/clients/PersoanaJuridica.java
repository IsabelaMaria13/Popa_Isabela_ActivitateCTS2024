package classes.clients;

public class PersoanaJuridica extends Client
{
    public PersoanaJuridica(String nume, int sumaCont) {
        super(nume, sumaCont);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(getNume() + " este persoana juridica");
    }
}
