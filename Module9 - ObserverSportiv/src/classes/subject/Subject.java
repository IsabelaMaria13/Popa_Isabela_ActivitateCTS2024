package classes.subject;

import classes.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> listaAbonati = new ArrayList<>();

    public void adaugareObserver(Observer observer) {
        listaAbonati.add(observer);
    }

    public void stergeObserver(Observer observer) {
        listaAbonati.remove(observer);
    }

    public void trimiteNotificare(String mesaj) {
        for (Observer observer : listaAbonati) {
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaMeciFotbal();
    public abstract void notificaMeciHandbal();
    public abstract void notificaMeciVolei();

}
