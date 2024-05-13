package classes;

public class NuAreCard implements State{
    @Override
    public void setState(Bancomat bancomat) {
        bancomat.setState(this);
    }
}
