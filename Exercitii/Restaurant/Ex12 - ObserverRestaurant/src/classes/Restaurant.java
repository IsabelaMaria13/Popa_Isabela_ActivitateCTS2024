package classes;

import client.Observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject {
    private String numeRestaurant;
    private List<Observer> listaAbonati;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.listaAbonati = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        this.listaAbonati.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        this.listaAbonati.remove(observer);
    }

    @Override
    public void trimiteNotificari(String mesaj) {
        for (int i = 0; i < this.listaAbonati.size(); i++) {
            this.listaAbonati.get(i).receptionareMesaj("Mesaj receptionat");
        }
    }
}
