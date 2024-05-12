package main;

import classes.AranjareMasa;
import classes.MasaRestaurant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MasaRestaurant masaRestaurant = new MasaRestaurant(4, true);
        AranjareMasa masaAranjata = new AranjareMasa("Andrei", true);
        AranjareMasa masaAranjata1 = new AranjareMasa("", false);


        masaAranjata1.sePregatesteMasa(masaRestaurant);
    }
}