package main;


import classes.Pacient;
import classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new PacientBuilder()
                .setHalat(true)
                .setMicDejun(true)
                .setPapuciCamera(true)
                .setPatRabatabil(true)
                .build();
        System.out.println(pacient);
    }
}