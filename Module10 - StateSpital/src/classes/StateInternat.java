package classes;

public class StateInternat implements State{
    protected StateInternat() {
    }

    @Override
    public void setState(Pacient pacient) {
        pacient.setState(this);
//        System.out.println("Pacientul " + pacient.getNume() + " este internat");
    }
}
