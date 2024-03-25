package main;

import classes.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz(2, 30000, 1000);
        Autobuz autobuz2 = autobuz1.clone();
        System.out.println(autobuz1);
        System.out.println(autobuz2);

    }
}