package main;

import classes.ContSportiv;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> sportiv = new HashMap<>();
        sportiv.put("A", 1);
        sportiv.put("B", 2);
        sportiv.put("C", 3);
        sportiv.put("D", 4);
        sportiv.put("E", 5);


        ContSportiv cont1 = new ContSportiv("Ilie", 17, sportiv);
        ContSportiv cont2 = cont1.clone();
        System.out.println(cont1);
        System.out.println(cont2);


    }
}