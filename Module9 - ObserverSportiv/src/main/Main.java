package main;

import classes.observer.Abonat;
import classes.observer.Observer;
import classes.observer.Vecin;
import classes.subject.Sala;
import classes.subject.Stadion;
import classes.subject.Subject;

public class Main {
    public static void main(String[] args) {
        Observer abonat1 = new Abonat("Ionel Ionescu");
        Observer abonat2 = new Abonat("George Georgescu");
        Observer abonat3 = new Abonat("Marian Marinescu");
        Observer vecin = new Vecin("Angel Angelescu", 10);


        Subject sala = new Sala();
        sala.adaugareObserver(abonat1);
        sala.adaugareObserver(abonat2);
        sala.adaugareObserver(abonat3);
        sala.adaugareObserver(vecin);

        sala.notificaMeciHandbal();

        Subject stadion = new Stadion();
        stadion.adaugareObserver(abonat1);
        stadion.adaugareObserver(abonat2);
        stadion.adaugareObserver(abonat3);

        ((Stadion) stadion).notificaConcert();

    }
}