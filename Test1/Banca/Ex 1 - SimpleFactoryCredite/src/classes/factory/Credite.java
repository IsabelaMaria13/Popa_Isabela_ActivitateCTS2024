package classes.factory;

import classes.bank.Credit;
import classes.bank.CreditBancar;
import classes.bank.CreditIpotecar;

public class Credite {
    public Credit creareCredite(TipCredit tipCredit, String numeDetinator, int suma) throws Exception{
        switch (tipCredit){
            case creditBancar -> {
                return new CreditIpotecar(numeDetinator, suma);
            }
            case creditIpotecar -> {
                return new CreditBancar(numeDetinator, suma);
            }
            default -> throw new Exception("Credit inexistent");
        }
    }
}
