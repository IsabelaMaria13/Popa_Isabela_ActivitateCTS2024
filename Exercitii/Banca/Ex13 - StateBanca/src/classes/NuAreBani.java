package classes;

public class NuAreBani implements State{
    @Override
    public void setState(Bancomat bancomat) {
        bancomat.setState(this);
    }
}
