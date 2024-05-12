package main;

import classes.Internare;
import classes.InternarePacient;
import classes.Pacient;
import classes.ProxyInternare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Alexandru", true);
        Pacient pacient1 =new Pacient("Marius", true);
        Pacient pacient2 = new Pacient("Ana", false);
        Pacient pacient3 = new Pacient("Ionela", false);
        Internare internareSpital = new InternarePacient("ATI");
        Internare proxy = new ProxyInternare(internareSpital);
        proxy.internare(pacient);
        proxy.internare(pacient3);
        proxy.internare(pacient1);
        proxy.internare(pacient2);
    }
}