package classes;

public class CreareCredit implements Banca {
    @Override
    public void creareCredit(Credit credit) {
        System.out.println("Creditul a fost creat cu succes pentru utilizatorul " + credit.getClient() +
                " in valuta " + credit.getValuta());
    }
}
