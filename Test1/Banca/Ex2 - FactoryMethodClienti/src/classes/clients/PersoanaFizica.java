package classes.clients;

public class PersoanaFizica extends Client{
    public PersoanaFizica(String nume, int sumaCont) {
        super(nume, sumaCont);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(getNume() + " este persoana fizica");
    }
}
