package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Farmacie extends Subject {
    private String nume;
    List<Observer> abonati;

    public Farmacie(String nume) {
        this.nume = nume;
        this.abonati = new ArrayList<>();
    }

    @Override
    public void adaugaAbonat(Observer observer) {
        abonati.add(observer);
    }

    @Override
    public void stergeAbonat(Observer observer) {
        abonati.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (int i = 0; i < abonati.size(); i++) {
            abonati.get(i).primesteNotificare(mesaj);
        }

    }
}
