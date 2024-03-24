package main;

import classes.BuilderSportiv;
import classes.Sportiv;

public class Main {
    public static void main(String[] args) {
        BuilderSportiv builderSportiv = new BuilderSportiv();
        Sportiv sportiv = builderSportiv
                .setGenMuzical(true)
                .setBauturaRacoritoareInclusa(true)
                .setMancareInclusa(true)
                .setScaunErgonomic(true)
                .setMuzicaAmbietalaPersonalizata(true)
                .build();
        System.out.println(sportiv);
    }
}