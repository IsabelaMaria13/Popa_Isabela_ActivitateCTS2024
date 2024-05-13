package classes;

public class ArePinIntrodus implements State{
    @Override
    public void setState(Bancomat bancomat) {
        bancomat.setState(this);
    }
}
