package main;

import classes.ContClienti;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> carduri = new HashMap<>();
        carduri.put(1, "39123981279381729");
        carduri.put(2, "37198127398172333");
        carduri.put(3, "98737822783823721");
        carduri.put(4, "12121299838299201");
        carduri.put(5, "10987654356271888");
        carduri.put(6, "82739812793871982");
        carduri.put(7, "12103102873812728");
        carduri.put(8, "37192873981279371");

        ContClienti contClienti1 = new ContClienti(carduri, "Ion Marin");
        ContClienti contClientExistent = contClienti1.clone();
        System.out.println(contClienti1);
        System.out.println(contClientExistent);


    }
}