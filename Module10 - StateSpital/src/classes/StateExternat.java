package classes;

public class StateExternat implements State {
    protected StateExternat() {
    }

    @Override
    public void setState(Pacient pacient) {
        pacient.setState(this);
//        System.out.println("Pacientul " + pacient.getNume() + " este externat");
    }
}
