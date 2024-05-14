package classes;

public class Reteta {
    private int nrReteta;
    private State state;

    public Reteta(int nrReteta) {
        this.nrReteta = nrReteta;
        this.state = new Emisa();
    }

    protected void setState(State state) {
        this.state = state;
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public void cerereMedicamente() {
        if (this.state instanceof Emisa) {
            State solicitata = new Solicitata();
            this.setState(solicitata);
            System.out.println("Reteta a fost emisa iar acum este solicitata!");
        } else {
            System.out.println("Reteta nu se afla in starea emisa pentru a fi solicitata.");
        }
    }

    public void vanzareMedicamente() {
        if (this.state instanceof Solicitata) {
            State achizitionata = new Achizitionata();
            this.setState(achizitionata);
            System.out.println("Reteta se afla in starea solicitata iar acum este achizitionata");
        } else {
            System.out.println("Reteta nu este solicitata pentru a fi achizitionata");
        }
    }
}
