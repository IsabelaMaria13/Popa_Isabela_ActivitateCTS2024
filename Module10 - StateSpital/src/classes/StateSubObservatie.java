package classes;

public class StateSubObservatie implements State{
    protected StateSubObservatie() {
    }

    @Override
    public void setState(Pacient pacient) {
        pacient.setState(this);
//        System.out.println("Pacientul " + pacient.getNume() + " este sub observatie");
    }
}
