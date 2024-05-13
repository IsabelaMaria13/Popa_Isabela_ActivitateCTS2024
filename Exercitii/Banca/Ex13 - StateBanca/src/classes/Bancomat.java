package classes;

public class Bancomat {
    private int nrBancomat;
    private double suma;
    private State state;

    public Bancomat(int nrBancomat, double suma) {
        this.nrBancomat = nrBancomat;
        this.suma = suma;
        this.state = new AreCard();
    }

    protected void setState(State state) {
        this.state = state;
    }

    public void seVerificaCardul() {
        if (this.state instanceof AreCard) {
            State areCard = new ArePinIntrodus();
            System.out.println("Va rugam introduceti pinul!");
            setState(areCard);
            System.out.println("Pin corect!");
        } else {
            if (this.state instanceof NuAreCard) {
                System.out.println("Va rugam introduceti cardul.");
            }
        }
    }

    public void seRealizeazaRetragerea() {
        if (this.state instanceof ArePinIntrodus) {
            if (this.suma != 0) {
                System.out.println("Retragerea s-a realizat cu succes.");
            } else {
                State nuAreBani = new NuAreBani();
                this.setState(nuAreBani);
                System.out.println("Va rugam incercati alt bancomat, acesta nu are bani.");
            }
        }
    }
}
