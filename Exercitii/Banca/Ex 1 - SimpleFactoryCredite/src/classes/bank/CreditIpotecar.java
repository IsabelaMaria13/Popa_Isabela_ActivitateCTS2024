package classes.bank;

public class CreditIpotecar extends Credit{
    public CreditIpotecar(String numeDetinator, int suma) {
        super(numeDetinator, suma);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Proprietarul " +getNumeDetinator() + " detine un cont ipotecar in valoare de " +getSuma());
    }
}
