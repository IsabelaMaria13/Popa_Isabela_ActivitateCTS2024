package main;


import classes.PersoanaFizica;
import classes.PersoanaJuridica;
import classes.ProcesareDocumente;

public class Main {
    public static void main(String[] args) {
        ProcesareDocumente procesareDocumente = new ProcesareDocumente();

        procesareDocumente.verificaDocumente();
        procesareDocumente.setVerificareActe(new PersoanaJuridica());
        procesareDocumente.verificaDocumente();


    }
}