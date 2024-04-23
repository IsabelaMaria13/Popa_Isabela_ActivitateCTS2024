package classes.bank;

public class CreditBancar extends Credit{
    public CreditBancar(String numeDetinator, int suma) {
        super(numeDetinator, suma);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Proprietarul " +getNumeDetinator() + " detine un cont bancar in valoare de " +getSuma());
    }
}
