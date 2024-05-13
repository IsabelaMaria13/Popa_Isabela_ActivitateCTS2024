package classes;

public class CreareCreditRON implements Banca {
    Banca credit;

    public CreareCreditRON(Banca credit) {
        this.credit = credit;
    }

    @Override
    public void creareCredit(Credit credit) {
        if (credit.getValuta() == "RON") {
            this.credit.creareCredit(credit);
        } else {
            System.out.println("Momentan putem realiza doar credite in RON");
        }
    }
}
