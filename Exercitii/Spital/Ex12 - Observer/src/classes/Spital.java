package classes;

import client.Observer;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subject{
    private String numeSpital;
    private List<Observer> pacientiAbonati;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
        this.pacientiAbonati = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        pacientiAbonati.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        pacientiAbonati.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observer observer: pacientiAbonati){
            observer.receptionareMesaj(mesaj);
        }
    }

    public void notificareReducereAnalize(){
        System.out.println("Luna aceasta toti pacientii spitalului beneficiaza de o reducere de 50% la pachetul standard de analize");
    }
}
