package classes;

import classes.Bancomat;
import classes.State;

public class AreCard implements State {
    @Override
    public void setState(Bancomat bancomat) {
       bancomat.setState(this);
    }
}
