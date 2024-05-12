package main;

import classes.MasaRestaurant;

public class Main {
    public static void main(String[] args) {
        MasaRestaurant masa = new MasaRestaurant(4, true);
        MasaRestaurant masa1 = new MasaRestaurant(2, false);

        masa.seRezervaMasa();
        masa.seOcupaMasa();
        masa1.seRezervaMasa();
        masa.seRezervaMasa();
        masa.seElibereazaMasa();
        masa.seOcupaMasa();
    }
}