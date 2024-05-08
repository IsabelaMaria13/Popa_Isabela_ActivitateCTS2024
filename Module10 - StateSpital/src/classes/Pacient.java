package classes;

public class Pacient {
    private String nume;

    protected void setState(State state) {
        this.state = state;
    }   //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! protected

    private State state;

    public Pacient(String nume) {
        this.nume = nume;
        state = new StateInternat();
    }

    public void seAgraveazaStarea() {
        if (this.state instanceof StateInternat) {
            State subObservatie = new StateSubObservatie();
            subObservatie.setState(this);
            System.out.println("Starea de sanatate a pacientului " + this.nume + " s-a agravat.");
        } else {
            System.out.println("Pacientul " + this.nume + " nu este internat.");
        }
    }

    public void seImbunatatesteStarea() {
        if (this.state instanceof StateSubObservatie) {
            State internare = new StateInternat();
            internare.setState(this);
            System.out.println("Sanatatea pacientului " + this.nume + " s-a imbunatatit.");
        } else {
            System.out.println("Pacientul " + this.nume + " nu era in stare grava.");
        }
    }

    public void vindecare() {
        if (this.state instanceof StateInternat) {
            State externat = new StateExternat();
            externat.setState(this);
            System.out.println("Pacientul " + this.nume + " este vindecat si externat.");
        } else {
            System.out.println("Pacientul " + this.nume + " nu poate fi externat.");
        }
    }
}
